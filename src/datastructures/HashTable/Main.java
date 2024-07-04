package datastructures.HashTable;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> s=new ArrayList<>();
        HashTable myHashTable = new HashTable();
        myHashTable.set("0",9);
        myHashTable.set("2",6);
        myHashTable.set("1",3);
        myHashTable.set("3",5);
        myHashTable.set("0",9);
        myHashTable.printTable();
        s=myHashTable.keys();
        System.out.println(s);

        /*
            EXPECTED OUTPUT:
            ----------------
            0:
            1:
            2:
            3:
            4:
            5:
            6:

    	*/

    }

}
