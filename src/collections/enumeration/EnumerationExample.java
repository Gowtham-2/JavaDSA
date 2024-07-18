package collections.enumeration;

import java.util.*;
public class EnumerationExample {
    public static void main(String[] args) {
        System.out.println("Vector Implementation:");
        Vector<Integer> vc=new Vector<>();
        vc.add(1);
        vc.add(2);
        vc.add(3);
        vc.add(4);
        vc.add(5);
        vc.add(6);
        Enumeration<Integer> en= vc.elements();
        System.out.println("Printing Elements using Enumeration:");
        while (en.hasMoreElements()){
            System.out.println(en.nextElement());
        }
        System.out.println("HashTable Implementation:");
        Hashtable<String,Integer> ht=new Hashtable<>();
        ht.put("one",1);
        ht.put("two",2);
        ht.put("three",3);
        ht.put("four",4);
        Enumeration<Integer> hten= ht.elements();
        System.out.println("Printing HashTable using Enumeration:");
        while (hten.hasMoreElements()){
            System.out.println(hten.nextElement());
        }
        System.out.println("Stack Implementation:");
        Stack<Integer> stack=new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        Enumeration<Integer> sten=stack.elements();
        System.out.println("Printing Stack Elements using Enumeration:");
        while (sten.hasMoreElements()){
            System.out.println(sten.nextElement());
        }
    }
}
