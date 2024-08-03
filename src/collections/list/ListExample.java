package collections.list;

import java.util.*;

public class ListExample {
    public static void main(String[] args) {
        //int[] array={1,2,3,4};
        List<Integer> arrayList=new ArrayList<>();
        List<Integer> linkedList=new LinkedList<>();
        List<Integer> vector=new Vector<>();
        List<Integer> stack=new Stack<>();

        //Adding elements

        arrayList.add(1);
        arrayList.add(0,3);
        arrayList.addAll(arrayList);
        System.out.println("ArrayList Elements:"+arrayList);

        linkedList.add(2);
        linkedList.add(2);
        linkedList.add(0,1);
        linkedList.addAll(0,arrayList);
        System.out.println("\nLinkedList Elements:"+linkedList);

        vector.add(1);
        vector.add(0,2);
        vector.addAll(2,linkedList);
        System.out.println("\nVector Elements:"+vector);

        stack.add(1);
        stack.add(2);
        stack.add(0,4);
        stack.addAll(vector);
        System.out.println("\nStack Elements:"+stack);

        //removing elements
        arrayList.remove(1);
        //arrayList.removeAll(linkedList);
        System.out.println("\nAfter Removing Elements ArrayList:"+arrayList);

        linkedList.remove(1);
        //linkedList.removeAll(vector);
        System.out.println("\nAfter Removing Elements LinkedList:"+linkedList);

        vector.remove((Object)3);
        //vector.removeAll(stack);
        System.out.println("\nAfter Removing Elements Vector:"+vector);

        stack.remove((Object)4);
        stack.remove((Object)3);
        //stack.removeAll(vector);
        System.out.println("\nAfter Removing Elements Stack:"+stack);

        //removeIf

        arrayList.removeIf(n->n%3==0);
        System.out.println("\nRemoving Elements using removeIf in ArrayList:"+arrayList);
        stack.removeIf(n->n%2==1);
        System.out.println("\nRemoving Elements using removeIf in Stack:"+stack);

        //retainAll

        linkedList.retainAll(stack);
        System.out.println("\nRetainAll method for linkedList:"+linkedList);

        vector.retainAll(linkedList);
        System.out.println("\nRetainAll method for vector:"+vector);

        //size

        System.out.println("\nArrayList size:"+arrayList.size());
        System.out.println("\nLinkedList size:"+linkedList.size());

        //clear
        stack.clear();
        System.out.println("\nStack Elements:"+stack);

        //contains

        System.out.println("\nContains Method:");
        System.out.println(arrayList.contains(1));
        System.out.println(vector.contains(2));
        System.out.println(linkedList.contains(3));

        //containsAll

        System.out.println("\nConstainsAll method:");
        System.out.println(vector.containsAll(arrayList));
        System.out.println(vector.containsAll(linkedList));
        System.out.println(linkedList.containsAll(vector));

        //toArray
        Object[] array=arrayList.toArray();
        Object[] array1=vector.toArray();
        System.out.println("\nArrayList to array:"+Arrays.toString(array));
        System.out.println("\nVector to array:"+Arrays.toString(array1));

        //isEmpty

        System.out.println("\nisEmpty() method:");
        System.out.println(arrayList.isEmpty());
        System.out.println(stack.isEmpty());

        System.out.println("\nPrinting Elements:");
        linkedList.add(2);
        arrayList.remove(0);
        System.out.println(arrayList);
        System.out.println(linkedList);
        System.out.println(vector);
        System.out.println(stack);

        //equals()

        System.out.println("\nEquals Method:");
        System.out.println(arrayList.equals(stack));
        System.out.println(linkedList.equals(arrayList));
        System.out.println(linkedList.equals(vector));
        System.out.println(vector.equals(linkedList));

        //toString
        System.out.println("\ntoString method:"+linkedList.toString());
    }
}
