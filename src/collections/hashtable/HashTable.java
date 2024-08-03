package collections.hashtable;

import java.util.*;

public class HashTable {
    public static void main(String[] args) {
        Hashtable<String,Integer> hashTable=new Hashtable<>();
        Hashtable<String,Integer> hashtable=new Hashtable<>(4);

        //adding elements
        hashTable.put("one",1);
        hashTable.put("two",2);
        hashtable.putAll(hashTable);

        //size
        System.out.println("Size of hashTable:"+hashTable.size());

        //keyset

        System.out.println("\nPrinting keys using keyset:"+hashTable.keySet());

        //keys
        //System.out.println("\nPrinting keys using keys:"+hashTable.keys());

        //printing keys using enumeration
        System.out.print("\nPrinting keys using enumeration:");
        Enumeration<String> keys=hashTable.keys();
        while (keys.hasMoreElements()){
            System.out.print(keys.nextElement()+" ");
        }

        System.out.println("\n\nPrinting values using enumeration:");
        Enumeration<Integer> enum1=hashTable.elements();
        while (enum1.hasMoreElements()){
            System.out.println(enum1.nextElement());
        }

        //contains
        System.out.println("\nContains method:"+hashTable.contains(6));

        System.out.println("\nContainsKey method:"+hashTable.containsKey("one"));

        System.out.println("\nContains value method:"+hashTable.containsValue(4));

        //entrySet method

        System.out.println("\nPrinting table using entrySet:");
        for(Map.Entry<String, Integer> entries:hashTable.entrySet()){
            System.out.println(entries.getKey()+":"+entries.getValue()+":"+entries.getClass());
        }

        //replace

        System.out.println("\nreplace method:");
        hashTable.replace("one",1,3);
        hashTable.replace("two",5);
        System.out.println(hashTable);

        //values
        System.out.println("\nHashTable values:"+hashTable.values());

        //hashTable iterator

        System.out.println("\nhashTable iterator:");
        Iterator<String> itr=hashTable.keySet().iterator();
        Iterator<String> itr1=hashTable.keys().asIterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        //getOrDefault

        System.out.println("\ngetOrDefault method:"+hashTable.getOrDefault("six",22));

        //isEmpty

        System.out.println("\nisEmpty() method:"+hashTable.isEmpty());

        //toString

        System.out.println("toString method:"+hashTable.toString());
    }
}
