package algorithms.recursion.towerofhanoi;

public class Puzzle {
    public static void main(String[] args) {
        towerOfHanoi(4,'X','Y','Z');
    }
    static void towerOfHanoi(int n,char from,char aux,char to){
        if(n==1){
            System.out.println("Moving the disk 1 from "+from+" to the "+to+" rod");
        }
        else {
            towerOfHanoi(n - 1, from, aux, to);
            System.out.println("Moving the disk " + n + " from " + from + " to the " + to + " rod");
            towerOfHanoi(n - 1, aux, to, from);
        }
    }
}
