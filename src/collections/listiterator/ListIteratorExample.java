package collections.listiterator;

import java.util.*;

public class ListIteratorExample{
    public static void main(String[] args) {
        List<Integer> arraylist=new ArrayList<>();
        arraylist.add(1);
        arraylist.add(2);
        arraylist.add(3);
        arraylist.add(4);
        arraylist.add(5);
        System.out.println("Array List Iterator:");
        ListIterator<Integer> arrayIterator= arraylist.listIterator();
        System.out.println("\nTraversing through Forward Direction:");
        while(arrayIterator.hasNext()){
            System.out.println("Element at index "+arrayIterator.nextIndex()+" is "+arrayIterator.next());
        }
        System.out.println("\nTraversing through Backward Direction:");
        while(arrayIterator.hasPrevious()){
            System.out.println("Element at index "+arrayIterator.previousIndex()+" is "+arrayIterator.previous());
        }
        List<Integer> linkedlist=new LinkedList<>();
        linkedlist.add(1);
        linkedlist.add(2);
        linkedlist.add(3);
        linkedlist.add(4);
        linkedlist.add(5);
        System.out.println("\nLinked List Iterator:");
        ListIterator<Integer> linkedlistIterator= arraylist.listIterator();
        System.out.println("\nTraversing through Forward Direction:");
        while(linkedlistIterator.hasNext()){
            System.out.println("Element at index "+linkedlistIterator.nextIndex()+" is "+linkedlistIterator.next());
        }
        System.out.println("\nTraversing through Backward Direction:");
        while(linkedlistIterator.hasPrevious()){
            System.out.println("Element at index "+linkedlistIterator.previousIndex()+" is "+linkedlistIterator.previous());
        }
        System.out.println("\nVector Iterator:");
        List<Integer> vectorlist=new Vector<>();
        vectorlist.add(1);
        vectorlist.add(2);
        vectorlist.add(3);
        vectorlist.add(4);
        vectorlist.add(5);
        ListIterator<Integer> vectorIterator= vectorlist.listIterator();
        System.out.println("\nTraversing through Forward Direction:");
        while(vectorIterator.hasNext()){
            System.out.println("Element at index "+vectorIterator.nextIndex()+" is "+vectorIterator.next());
        }
        System.out.println("\nTraversing through Backward Direction:");
        while(vectorIterator.hasPrevious()){
            System.out.println("Element at index "+vectorIterator.previousIndex()+" is "+vectorIterator.previous());
        }
        System.out.println("\nStack Iterator:");
        List<Integer> stacklist=new Stack<>();
        stacklist.add(1);
        stacklist.add(2);
        stacklist.add(3);
        stacklist.add(4);
        stacklist.add(5);
        ListIterator<Integer> stackIterator= stacklist.listIterator();
        System.out.println("\nTraversing through Forward Direction:");
        while(stackIterator.hasNext()){
            System.out.println("Element at index "+stackIterator.nextIndex()+" is "+stackIterator.next());
        }
        System.out.println("\nTraversing through Backward Direction:");
        while(stackIterator.hasPrevious()){
            System.out.println("Element at index "+stackIterator.previousIndex()+" is "+stackIterator.previous());
        }

    }
}
