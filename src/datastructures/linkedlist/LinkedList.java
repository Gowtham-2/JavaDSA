package datastructures.linkedlist;
import java.util.HashSet;
import java.util.Set;

public class LinkedList {

    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public int getLength() {
        return length;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void printAll() {
        if (length == 0) {
            System.out.println("Head: null");
            System.out.println("Tail: null");
        } else {
            System.out.println("Head: " + head.value);
            System.out.println("Tail: " + tail.value);
        }
        System.out.println("Length:" + length);
        System.out.println("\nLinked List:");
        if (length == 0) {
            System.out.println("empty");
        } else {
            printList();
        }
    }

    public void makeEmpty() {
        head = null;
        tail = null;
        length = 0;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    public Node removeLast() {
        if (length == 0) return null;
        Node temp = head;
        Node pre = head;
        while (temp.next != null) {
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        length--;
        if (length == 0) {
            head = null;
            tail = null;
        }
        return temp;
    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    public Node removeFirst() {
        if (length == 0) return null;
        Node temp = head;
        head = head.next;
        temp.next = null;
        length--;
        if (length == 0) {
            tail = null;
        }
        return temp;
    }

    public Node get(int index) {
        if (index < 0 || index >= length) return null;
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public boolean set(int index, int value) {
        Node temp = get(index);
        if (temp != null) {
            temp.value = value;
            return true;
        }
        return false;
    }

    public boolean insert(int index, int value) {
        if (index < 0 || index > length) return false;
        if (index == 0) {
            prepend(value);
            return true;
        }
        if (index == length) {
            append(value);
            return true;
        }
        Node newNode = new Node(value);
        Node temp = get(index - 1);
        newNode.next = temp.next;
        temp.next = newNode;
        length++;
        return true;
    }

    public Node remove(int index) {
        if (index < 0 || index >= length) return null;
        if (index == 0) return removeFirst();
        if (index == length - 1) return removeLast();

        Node prev = get(index - 1);
        Node temp = prev.next;

        prev.next = temp.next;
        temp.next = null;
        length--;
        return temp;
    }

    public void reverse() {
        Node temp = head;
        head = tail;
        tail = temp;
        Node after = temp.next;
        Node before = null;
        for (int i = 0; i < length; i++) {
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }
    }

    public Node findKthFromEnd(int k) {
        Node fast = head;
        Node slow = head;
        for (int i = 0; i < k; i++) {
            if (fast == null)
                return null;
            fast = fast.next;
        }
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

    public void removeDuplicates() {
        Set<Integer> set = new HashSet<>();
        Node previous = null;
        Node current = head;
        while (current != null) {
            if (set.contains(current.value)) {
                previous.next = current.next;
                length -= 1;
            } else {
                set.add(current.value);
                previous = current;
            }
            current = current.next;
        }
    }

    public void removeDuplicatesWithoutSet() {
        Node current = head;
        while (current != null) {
            Node runner = current;
            while (runner.next != null) {
                if (runner.next.value == current.value) {
                    runner.next = runner.next.next;
                    length -= 1;
                } else {
                    runner = runner.next;
                }
            }
            current = current.next;
        }
    }

    public int binaryToDecimal() {
        Node temp = head;
        int val = 0;
        while (temp != null) {
            val = val * 2 + temp.value;
            temp = temp.next;
        }
        return val;
    }

    public void reverseBetween(int m, int n) {
        if (head == null) return;
        Node dummyNode = new Node(0);
        dummyNode.next = head;
        Node beforeNode = dummyNode;
        int pos = 0;
        while (pos < m) {
            beforeNode = beforeNode.next;
            pos++;
        }
        Node currentNode = beforeNode.next;
        Node nextNode;
        while (m < n) {
            nextNode = currentNode.next;
            currentNode.next = nextNode.next;
            nextNode.next = beforeNode.next;
            beforeNode.next = nextNode;
            m++;
        }
        head = dummyNode.next;
    }

    public void partitionList(int x) {
        if (head == null) return;

        Node dummy1 = new Node(0);
        Node dummy2 = new Node(0);
        Node prev1 = dummy1;
        Node prev2 = dummy2;
        Node current = head;

        while (current != null) {
            if (current.value < x) {
                prev1.next = current;
                prev1 = current;
            } else {
                prev2.next = current;
                prev2 = current;
            }
            current = current.next;
        }

        prev2.next = null;
        prev1.next = dummy2.next;

        head = dummy1.next;
    }

    public void bubbleSort() {
        if (length < 2)
            return;
        Node sortedUntil = null;
        while (sortedUntil != this.head.next) {
            Node temp = this.head;
            while (temp.next != sortedUntil) {
                Node nextNode = temp.next;
                if (temp.value > nextNode.value) {
                    int val = temp.value;
                    temp.value = nextNode.value;
                    nextNode.value = val;
                }
                temp = temp.next;
            }
            sortedUntil = temp;
        }
    }
    public void selectionSort(){
        if(length<2)
            return;
        Node current=head;
        while(current.next!=null){
            Node smallest=current;
            Node innerCurrent=current.next;
            while(innerCurrent!=null){
                if(innerCurrent.value<smallest.value){
                    smallest=innerCurrent;
                }
                innerCurrent=innerCurrent.next;

            }
            if(smallest!=current){
                int temp=smallest.value;
                smallest.value=current.value;
                current.value=temp;
            }
            current=current.next;
        }

    }
    public void insertionSort(){
        if(length<2)
            return;
        Node sortedListHead=head;
        Node unSortedListHead=head.next;
        sortedListHead.next=null;
        while(unSortedListHead!=null){
            Node current=unSortedListHead;
            unSortedListHead=unSortedListHead.next;
            if(current.value<sortedListHead.value){
                current.next=sortedListHead;
                sortedListHead=current;
            }
            else{
                Node searchPointer=sortedListHead;
                while(searchPointer.next!=null&&current.value>searchPointer.next.value){
                    searchPointer=searchPointer.next;
                }
                current.next=searchPointer.next;
                searchPointer.next=current;
            }
        }
        head=sortedListHead;
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        tail=temp;

    }
}



