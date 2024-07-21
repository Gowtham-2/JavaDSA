package collections.iterable;

import java.util.ArrayList;

public class IterableExample {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        System.out.println("Iterating using for-each loop:");
        for(int n:al) {
            System.out.println(n);
        }
        System.out.println("Iterating using forEach() method:");
        al.forEach(System.out::println);
        //al.forEach(ele->System.out.println(ele));
    }
}
