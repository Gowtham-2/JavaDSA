package datastructures.doublylinkedlist;
public class Main {

    public static void main(String[] args) {

        DoublyLinkedList myDLL = new DoublyLinkedList(7);

        myDLL.append(9);
        myDLL.append(6);
        myDLL.append(7);
        myDLL.append(8);
        myDLL.printAll();


        /*
            EXPECTED OUTPUT:
            ----------------
            Head: 7
            Tail: 7
            Length: 1

            Linked List:
            7

        */

    }

}
