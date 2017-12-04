/**
 * Created by Администратор on 30.11.2017.
 */
public class User {
    private UserBehavior behavior;
    private String name;
    private String pass;

    public User(UserBehavior behavior, String name, String pass) {
        this.behavior = behavior;
        this.name = name;
        this.pass = pass;
    }

    public String getName() {
        return name;
    }

    public String getPass() {
        return pass;
    }

    public UserBehavior getBehavior() {
        return behavior;
    }
}
