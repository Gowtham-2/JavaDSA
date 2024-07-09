package datastructures.doublylinkedlist;
public class DoublyLinkedList {

    private Node head;
    private Node tail;
    private int length;

    class Node{
        int value;
        Node next;
        Node prev;

        public Node(int value){
            this.value=value;
        }
    }

    public DoublyLinkedList(int value){
        Node newNode=new Node(value);
        head=newNode;
        tail=newNode;
        length=1;
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
        System.out.println("\nDoubly Linked List:");
        if (length == 0) {
            System.out.println("empty");
        } else {
            printList();
        }
    }

    public void append(int value){
        Node newNode=new Node(value);
        if(length==0){
            head=newNode;
            tail=newNode;
        }
        tail.next=newNode;
        newNode.prev=tail;
        tail=newNode;
        length++;
    }

    public Node removeLast(){
        Node temp=tail;
        if(length==0){
            return null;
        }
        else if(length==1){
            head=null;
            tail=null;
        }
        else{
            tail=tail.prev;
            tail.next=null;
            temp.prev=null;
        }
        length--;
        return temp;
    }

    public void prepend(int value){
        Node newNode=new Node(value);
        if(length==0){
            head=newNode;
            tail=newNode;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
        length++;
    }
    public Node get(int index){
        if(index<0 || index>=length) return null;
        Node temp;
        if(index<length/2){
            temp=head;
            for(int i=0;i<index;i++){
                temp=temp.next;
            }
        }
        else{
            temp=tail;
            for(int i=length-1;i>index;i--){
                temp=temp.prev;
            }
        }
        return temp;
    }


    public Node removeFirst() {
        if(length == 0) return null;
        Node temp = head;
        if(length == 1) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
            temp.next = null;
        }
        length--;
        return temp;
    }

    public boolean insert(int index, int value) {
        if(index < 0 || index > length) return false;
        if(index == 0) {
            prepend(value);
            return true;
        }
        if(index == length) {
            append(value);
            return true;
        }
        Node newNode = new Node(value);
        Node before = get(index - 1);
        Node after = before.next;
        newNode.prev = before;
        newNode.next = after;
        before.next = newNode;
        after.prev = newNode;
        length++;
        return true;
    }

    public Node remove(int index){
        if(index<0 || index>=length) return null;
        Node temp;
        if(index==0){
            return removeFirst();
        }
        if(index==length-1){
            return removeLast();
        }
        temp=get(index);
        temp.next.prev=temp.prev;
        temp.prev.next=temp.next;
        temp.prev=null;
        temp.next=null;
        length--;
        return temp;
    }


}

