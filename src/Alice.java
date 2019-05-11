import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Alice {

    public static void main(String[] args) {

        Set <String> set = new TreeSet<>();
        try {
        List <String> list  = Files.readAllLines(Paths.get("src/alice30.txt"));



        for (String line : list) {

            line = line.replaceAll("\\p{Punct}|\\d", "");

            String [] words = line.split(" ");
            for (String word :words) {
                //System.out.println(word + "|");
                if (!word.isEmpty()) {
                    set.add(word.toLowerCase());
                }
                System.out.println();
            }

        }

           // list.get(0).split("");


        } catch (IOException e)

        {
            System.out.println("cos poszlo zle przy wczytywaniu piliku");
            e.printStackTrace();
        }
        for (String word : set ) {
            System.out.println(word);
        }
        System.out.println("znaleziono roznych wyrazow:" + set.size());
    }
}
