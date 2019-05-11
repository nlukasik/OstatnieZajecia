import java.util.LinkedList;
import java.util.List;

public class Person {
    public static final int LIST_SIZE = 100000;
    public static void main(String[] args) {

        List<Nazwiska> person = new LinkedList<>();
        Nazwiska nazwiska = new Nazwiska("Wojciech", "Kowalski", 12);

        Stopwatch stopwatch = new Stopwatch();

        for (int i = 0; i < LIST_SIZE; i++) {
            person.add(0, nazwiska);

        }

        stopwatch.show();

        for (int i = 0; i < LIST_SIZE/2; i++) {
            person.remove(0);
            person.remove(person.size()-1);

        }

        stopwatch.show();

    }



}
