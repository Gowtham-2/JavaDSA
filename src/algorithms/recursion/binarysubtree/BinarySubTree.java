package algorithms.recursion.binarysubtree;
import java.util.ArrayList;
class Node {
    int value;
    Node left;
    Node right;
    Node(int value) {
        this.value = value;
    }
}

public class BinarySubTree {
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);

        Node root2=new Node(4);
        root2.left=new Node(5);
        root2.right=new Node(6);

        System.out.println(checkSubTree(root,root2));

    }
    public static boolean checkSubTree(Node tree,Node sub){
        if(sub==null)
            return true;
        if(tree==null)
            return false;

        ArrayList<Integer> list1=InOrder(tree);
        ArrayList<Integer> list2=InOrder(sub);
        if(!listToString(list1).contains(listToString(list2))){
            return false;
        }
        list1.clear();;
        list2.clear();

        list1=PreOrder(tree);
        list2=PreOrder(sub);

        return listToString(list1).contains(listToString(list2));
    }
    private static String listToString(ArrayList<Integer> arr){
        return arr.toString().replace("[","").replace("]","").replace(",","");
    }
    public static ArrayList<Integer> PreOrder(Node root){
        ArrayList<Integer> result=new ArrayList<>();
        class Traverse{
            Traverse(Node currentNode){
                result.add(currentNode.value);
                if(currentNode.left!=null){
                    new Traverse(currentNode.left);
                }
                if(currentNode.right!=null){
                    new Traverse(currentNode.right);
                }
            }
        }
        new Traverse(root);
        return result;
    }
    public static ArrayList<Integer> InOrder(Node root){
        ArrayList<Integer> result=new ArrayList<>();
        class Traverse{
            Traverse(Node currentNode){
                if(currentNode.left!=null){
                    new Traverse(currentNode.left);
                }
                result.add(currentNode.value);
                if(currentNode.right!=null){
                    new Traverse(currentNode.right);
                }
            }
        }
        new Traverse(root);
        return result;
    }
}
