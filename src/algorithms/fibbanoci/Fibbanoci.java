package algorithms.fibbanoci;

public class Fibbanoci {
    static int counter=0;
    //by using memoization
    static Integer[] memo=new Integer[100];
    public static int fib(int n){
        counter++;
        if(memo[n]!=null){
            return memo[n];
        }
        if(n==0 || n==1){
            return n;
        }
        memo[n]=fib(n-1)+fib(n-2);
        return memo[n];
    }
    public static void main(String[] args) {
        int n=60;
        System.out.println(n+"th fibbanoci numbaer is:"+fib(n));
        System.out.println("No of times the function runned is:"+counter);
    }
}
