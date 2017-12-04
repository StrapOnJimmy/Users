/**
 * Created by Администратор on 30.11.2017.
 */
public class StudentBehavior implements UserBehavior {
    @Override
    public void create() {
        System.out.println("no");
    }

    @Override
    public void remove() {
        System.out.println("no");
    }

    @Override
    public void update() {
        System.out.println("ok");
    }

    @Override
    public void delete() {
        System.out.println("no");
    }
}