import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTester {

    public static void main(String[] args) {

        Set<A> mySet = new HashSet<>();

        for (int i = 0; i < 100; i++) {
            mySet.add(new A (1, "aaa"));

        }

        System.out.println(mySet);

    }
}
