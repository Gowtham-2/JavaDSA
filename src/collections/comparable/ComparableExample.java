package collections.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableExample implements Comparable<ComparableExample> {
    int rollno;
    String name;
    int age;
    ComparableExample(int rollno,String name,int age){
        this.rollno=rollno;
        this.name=name;
        this.age=age;
    }
    public static void main(String[] args) {
        ArrayList<ComparableExample> al=new ArrayList<>();
        al.add(new ComparableExample(1,"Sai",22));
        al.add(new ComparableExample(2,"Hemanth",20));
        al.add(new ComparableExample(3,"Sandweep",23));
        al.add(new ComparableExample(4,"Jayadweep",22));
        Collections.sort(al);
        for (ComparableExample ce:al){
            System.out.println(ce.age+" "+ce.rollno+" "+ce.name);
        }
    }

    @Override
    public int compareTo(ComparableExample o) {
        if(age==o.age)
            return 0;
        else if(age>o.age)
            return 1;

        return -1;
    }
}
