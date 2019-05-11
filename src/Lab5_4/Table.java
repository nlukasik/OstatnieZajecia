package Lab5_4;

import java.util.List;

public class Table {

    public static void main(String[] args) {


        Integer[] myTable = new Integer[4];
        myTable[0]=1;
        myTable[1]=1;
        myTable[2]=1;
        myTable[3]=1;

        table(myTable);

        String [] myTable2 = new String[4];
        myTable2[0]= "a";
        myTable2[1]= "a";
        myTable2[2]= "a";
        myTable2[3]= "a";


        table(myTable2);
    }

    public static <T> void table (T [] tablica) {
                for (T e : tablica) {
        System.out.println(e + "");
    }

        System.out.println();
}

        class Generic <X , Y, Z> {
        private X objectX;
        private Y objectY;
        private Z objectZ;

        }
}
