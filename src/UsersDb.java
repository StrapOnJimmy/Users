import java.util.ArrayList;

/**
 * Created by Администратор on 30.11.2017.
 */
public class UsersDb {
    private ArrayList<User> users = new ArrayList<>();

    public void addUsers(User user){
        users.add(user);
    }

    public User getUser(String name) throws Exception{
        for (User user : users
                ) {
            if (user.getName().equals(name)) return user;
        }
        throw new Exception("User doesn't exist");
    }
}
