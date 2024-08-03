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
        linkedHashMap.put("six",6);
        linkedHashMap.put("seven",7);
        map.putAll(linkedHashMap);
        System.out.println("Printing map:"+map);
        //size

        System.out.println("\nSize of map:"+map.size());

        //checking a key is present

        System.out.println("\n"+map.get("two")+" key is present:"+map.containsKey("two"));

        //checking a value is present

        System.out.println("\nContainsValue method:"+map.containsValue(2));

        //entrySet

        System.out.println("\nEntry Set Method:\n");
        for (Map.Entry<String,Integer> entry:map.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue()+" "+entry.getClass());
        }

        //keySet

        System.out.println("\nKet Set in Map:"+map.keySet());

        //values

        System.out.println("\nValues of the map:"+map.values());

        //keyset iterator

        System.out.println("\nKeySet Iterator:");
        Set<String> keys=map.keySet();
        Iterator<String> itr=keys.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
        System.out.println("\n\nContains value method:");
        System.out.print("2 is present:"+map.containsValue(2)+"\n");

        //replace

        map.replace("one",2);
        System.out.println("\nPrinting Map:"+map);

        //getOrDefault

        System.out.println("\ngetOrDefault method:"+map.getOrDefault("six",20));

    }
}
