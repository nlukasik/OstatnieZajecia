import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTester {

    public static void main(String[] args) {
        Map<String, String> phones = new HashMap<>();
        phones.put("Tomek", "352-523-266");
        phones.put("Alicja", "352-523-266");
        phones.put("Tomek", "999-999-999");

        phones.put("Barbara", "999-999-999");

        System.out.println(phones);

        Set<String> keys = phones.keySet();
        System.out.println(keys);

        System.out.println(phones.containsKey("Barbara"));

        System.out.println(phones.containsKey("Wojciech"));


        for (String key :keys) {
            System.out.println("Imie: " + key + ", telefon: " + phones.get(key));
        }

        for (String value : phones.values()) {
            System.out.println("telefon: " + value);
        }

        System.out.println();

        for(Map.Entry entry : phones.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
            entry.setValue("0");
        }

        System.out.println(phones);

    }


}
