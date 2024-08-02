package collections.map;

import java.util.*;

public class MapExample{
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        Map<String,Integer> linkedHashMap=new LinkedHashMap<>();
        //adding elements

        map.put("one",1);
        map.put("two",2);
        map.put("three",3);
        map.put("four",4);
        map.put("five",5);
        System.out.println("Printing map:"+map);
        //size

        System.out.println("Size of map:"+map.size());

        //checking a key is present

        System.out.println(map.get("two")+" key is present:"+map.containsKey("two"));

        //entrySet

        System.out.println("Entry Set Method:");
        for (Map.Entry<String,Integer> entry:map.entrySet()){
            System.out.print(entry.getKey()+" ");
            System.out.println(entry.getValue());
        }

        //keySet

        System.out.println("Ket Set in Map:"+map.keySet());

        //values

        System.out.println("Values of the map:"+map.values());

        //keyset iterator

        System.out.println("KeySet Iterator:");
        Set<String> keys=map.keySet();
        Iterator<String> itr=keys.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
        System.out.print("\nContains value method:");
        System.out.print(map.containsValue(2)+"\n");

        //replace

        map.replace("one",2);
        System.out.println(map);

        //getOrDefault

        System.out.println("getOrDefault method:"+map.getOrDefault("six",20));

    }
}
