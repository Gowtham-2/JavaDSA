package collections.iteratorexample;
import java.util.*;
import java.util.Enumeration;
public class IteratorExample {
    public static void main(String[] args) {
        //iterator can be applied to any collection in java
        List<Integer> al=new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
        al.add(60);
        //iterator moves only in forward direction
        System.out.println("Printing List Elements using Iterator:");
        Iterator<Integer> it=al.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("Printing Elements using Enumeration:");
        Enumeration<Integer> e=Collections.enumeration(al);
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
        System.out.println("Printing Queue Elements using Iterator:");
        Queue<Integer> vc=new LinkedList<>();
        vc.add(0);
        vc.add(10);
        vc.add(20);
        vc.add(30);
        vc.add(40);
        vc.add(50);
        vc.add(60);
        //iterator moves only in forward direction
        Iterator<Integer> it1=vc.iterator();
        while(it1.hasNext()){
            System.out.println(it1.next());
        }

    }
}
