package am.aro.fake;

import am.aro.model.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class FakeStorage {
    private static final FakeStorage storage;

    static{
        storage = new FakeStorage();
    }
    private List<User> users;
    private FakeStorage(){
        this.users = new ArrayList<>();
        User user = new User("Aro","I LOVE YOU", LocalDate.parse("2015-10-10"));
        User user1 = new User("Ani","qaxcr", LocalDate.parse("1997-02-09"));
        User user2 = new User("Aro","hamov", LocalDate.parse("1994-05-28"));
        users.add(user);
        users.add(user1);
        users.add(user2);
    }
    public static FakeStorage storage(){
        return storage;
    }
    public List<User> users(){
        return users;
    }
}
