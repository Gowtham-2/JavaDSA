package collections.queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> priorityQueue=new PriorityQueue<>();
        Queue<Integer> arrayDeque=new ArrayDeque<>();
        Deque<Integer> deque=new ArrayDeque<>();

        //adding

        priorityQueue.offer(1);
        priorityQueue.offer(2);
        System.out.println(priorityQueue.peek());
        System.out.println("Priority Queue:"+priorityQueue);

        arrayDeque.offer(1);
        arrayDeque.offer(2);
        System.out.println("ArrayDeque:"+arrayDeque);

        deque.offer(1);
        deque.offer(2);
        System.out.println("Deque:"+deque);

        deque.addAll(arrayDeque);
        System.out.println(deque);

        //remove

        deque.remove();
        System.out.println("Deque:"+deque);

        //peek element
        System.out.println("Peeked Element:"+deque.peek());
    }
}
