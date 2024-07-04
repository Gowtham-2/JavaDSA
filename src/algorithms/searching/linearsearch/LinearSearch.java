package algorithms.searching.linearsearch;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr={1,7,4,9,3,5,6};
        int res=linearSearch(arr,9);
        if(res==-1)
            System.out.println("Element is not present in the array");
        else
            System.out.println("Element is present at index:"+res);
    }

    private static int linearSearch(int[] arr, int x) {
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x)
                return i;
        }
        return -1;
    }
}
