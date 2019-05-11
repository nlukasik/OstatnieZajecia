import java.sql.Array;
import java.util.*;

public class ListTester {
    public static void main(String[] args) {



        List<String> myList = new LinkedList<>();
        myList = new LinkedList<>(Arrays.asList("a","b","c","a","e"));
        System.out.println("Wystepuje " + Collections.frequency(myList, "a"));



//        List <Integer> myList = new ArrayList<>();
//        myList = Arrays.asList(1,2,3,4,5);



//        System.out.println(myList.size());
//
//
//        for(int i =0; i < myList.size(); i++ ) {
//            System.out.println(myList.get(i));
//        }
//
//
//        for (Integer i : myList) {
//            System.out.println(i);
//        }
//
//
//
//
//        List<String> myList1 = new LinkedList();
//        myList1.add("pierwszy");
//        myList1.add("drugi");
//        myList1.add("trzeci");
//        myList1.add("czwarty");
//
//        System.out.println(myList1);
//
//        myList1.add(0,"zerowy");
//        myList1.remove("drugi");
//        System.out.println(myList1);
//
//



    }



}