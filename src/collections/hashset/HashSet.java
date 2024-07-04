package collections.hashset;
import java.util.*;

public class HashSet {
    public static void main(String[] args) {
        Set<Integer> set=new TreeSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.remove(1);
        set.add(7);
        Set<Integer> otherSet = new TreeSet<>();
        otherSet.add(3);
        otherSet.add(4);
        otherSet.add(5);
        otherSet.add(6);
        Set<Integer> union=new TreeSet<>(set);
        union.addAll(otherSet);
        System.out.println(union);
        Set<Integer> intersection=new TreeSet<>(set);
        intersection.retainAll(otherSet);
        System.out.println(intersection);
        Set<Integer> difference1 = new TreeSet<>(set);
        difference1.removeAll(otherSet);
        System.out.println(difference1);
        Set<Integer> difference2=new TreeSet<>(set);
        otherSet.removeAll(difference2);
        System.out.println(otherSet);
        if (set.contains(2)) {
            System.out.println("Found element in set");
        }
    }
}
