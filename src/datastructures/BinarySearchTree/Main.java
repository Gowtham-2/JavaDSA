package datastructures.BinarySearchTree;

public class Main {

    public static void main(String[] args) {

        BinarySearchTree myBST = new BinarySearchTree();

        myBST.rInsert(2);
        myBST.rInsert(1);
        myBST.rInsert(3);
        myBST.rInsert(4);
        myBST.rInsert(5);
        myBST.rInsert(6);
        myBST.rInsert(-1);
        myBST.rInsert(-2);
        myBST.rInsert(-3);

       /* System.out.println("Root:"+myBST.getRoot().value);
        System.out.println("Root->left:"+myBST.getRoot().left.value);
        System.out.println("Root->right:"+myBST.getRoot().right.value);

       // myBST.deleteNode(2);

        System.out.println("Root:"+myBST.getRoot().value);
        System.out.println("Root->left:"+myBST.getRoot().left.value);
        System.out.println("Root->right:"+myBST.getRoot().right);

        System.out.println("BST Contains 2:");
        System.out.println(myBST.rContains(2));

        System.out.println("\nBST Contains 4:");
        System.out.println(myBST.rContains(4));*/

        System.out.println(myBST.BFS());
        System.out.println(myBST.DFSPreOrder());
        System.out.println(myBST.DFSPostOrder());
        System.out.println(myBST.DFSInOrder());
        /*
            EXPECTED OUTPUT:
            ----------------
            BST Contains 27:
            true

            BST Contains 17:
            false

        */

    }

}
