package collections.sets;

import java.util.*;

public class SetExample {
    public static void main(String[] args) {
        //TreeSet Implementation

        System.out.println("TreeSet Implementation:");
        Set<Integer> set1=new TreeSet<>();
        SortedSet<Integer> set2=new TreeSet<>();
        NavigableSet<Integer> set3=new TreeSet<>();
        //TreeSet<Integer> set5=new TreeSet<>();

        for (int i = 1; i <= 10; i++) {
            set1.add(i);
            set2.add(i);
            set3.add(i);
        }
        /*set1.add(null);
        set2.add(null);
        set3.add(null);
         these three statement throws exception*/
        System.out.println(set1);
        System.out.println(set2);
        System.out.println(set3);

        //HashSet Implementation

        System.out.println("\nHashSet Implementation:");
        //AbstractSet<Integer> set=new HashSet<>();
        Set<Integer> set4=new HashSet<>();
        set4.add(2);
        set4.add(4);
        set4.add(1);
        set4.add(30);
        set4.add(3);
        set4.add(10);
        set4.add(null);
        System.out.println(set4);

        //LinkedHashSet Implementation

        System.out.println("\nLinkedHashSet Implementation:");
        Set<Integer> set5=new LinkedHashSet<>();
        for (int i = 1; i <= 10; i++) {
            set5.add(i);
        }
        set5.add(null);
        //set5.add(null);
        set5.addAll(Arrays.asList(10,11,12,13,14,15));
        System.out.println(set5);
    }
}
