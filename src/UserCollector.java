import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class UserCollector {

    public static void main(String[] args) {


        User user1 = new User ("Janek", "Kowalski", 15);
        User user2 = new User ("Janek", "Janeczek", 29);

        Map<Integer, User> map = new HashMap<>();

        map.put(1, user1);
        map.put(2, user2);

        for (User user : map.values())
            System.out.println(user);


        Set<Integer> keys = map.keySet();
        System.out.println(keys);


        System.out.println(map.get(2));
        System.out.println(map.get(4));
    }

}
