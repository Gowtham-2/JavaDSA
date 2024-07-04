package datastructures.heaps;

public class Main {
    public static void main(String[] args) {
        Heap hp=new Heap();

        hp.insert(95);
        hp.insert(75);
        hp.insert(80);
        hp.insert(55);
        hp.insert(60);
        hp.insert(50);
        hp.insert(65);


        System.out.println(hp.getHeap());

       /* hp.insert(100);
        System.out.println(hp.getHeap());

        hp.insert(75);
        System.out.println(hp.getHeap());*/

        hp.remove();
        System.out.println(hp.getHeap());

        hp.remove();
        System.out.println(hp.getHeap());
    }
}
