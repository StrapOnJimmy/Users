import java.io.StringReader;
import java.util.Scanner;

/**
 * Created by Администратор on 30.11.2017.
 */
public class Main {
    private static UsersDb usersDb = new UsersDb();
    private static User currentUser;

    public static void main(String[] args) {
        User admin = new User(new StudentBehavior(), "admin", "12345");
        usersDb.addUsers(admin);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            if (logIn()) {
                while (true) {
                    System.out.println("1.Create;");
                    System.out.println("2.Remove;");
                    System.out.println("3.Update;");
                    System.out.println("4.Delete;");
                    System.out.println("5.Logout");
                    String key = scanner.nextLine();

                    if (key.equals("1")) currentUser.getBehavior().create();
                    if (key.equals("2")) currentUser.getBehavior().remove();
                    if (key.equals("3")) currentUser.getBehavior().update();
                    if (key.equals("4")) currentUser.getBehavior().delete();
                    if (key.equals("5")) break;
                }
            }
        }
    }

    public static boolean logIn() {
        String pass;
        String name;
        User user;

        Scanner scanner = new Scanner(System.in);
        System.out.print("login: ");
        name = scanner.nextLine();
        try {
            user = usersDb.getUser(name);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        System.out.print("password: ");
        pass = scanner.nextLine();
        if (user.getPass().equals(pass)) {
            currentUser = user;
            return true;
        }
        return false;
    }
}
