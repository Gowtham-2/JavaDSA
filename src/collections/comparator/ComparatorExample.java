package collections.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student{
    int rollno;
    String name;
    int age;
    Student(int rollno,String name,int age){
        this.age=age;
        this.name=name;
        this.rollno=rollno;
    }
}
class AgeComparator implements Comparator<Student>{
   @Override
    public int compare(Student s1,Student s2) {
        if (s1.age == s2.age)
            return 0;
        else if (s1.age > s2.age) {
            return 1;
        }
        return -1;
    }
}
class NameComparator implements Comparator<Student>{


    @Override
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);
    }
}
public class ComparatorExample {
    public static void main(String[] args) {
        ArrayList<Student> al=new ArrayList<>();
        al.add(new Student(1,"Vijay",23));
        al.add(new Student(2,"Ajay",22));
        al.add(new Student(3,"Jai",21));
        System.out.println("Sorting by Name:");
        Collections.sort(al,new NameComparator());
        for(Student st:al){
            System.out.println(st.rollno+" "+ st.age+" "+st.name);
        }
        System.out.println("Sorting by Age:");
        Collections.sort(al,new AgeComparator());
        for(Student st:al){
            System.out.println(st.rollno+" "+ st.age+" "+st.name);
        }
    }
}
