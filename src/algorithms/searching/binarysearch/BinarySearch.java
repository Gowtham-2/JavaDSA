package algorithms.searching.binarysearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={1,2,3,5,7,8,9,10};
        int res=iterativeBinarySearch(arr,7);
        if(res==-1)
            System.out.println("Element is not present in the array");
        else
            System.out.println("Element is present at index:"+res);
        int res2=recursiveBinarySearch(arr,9,0, arr.length-1);
        if(res2==-1)
            System.out.println("Element is not present in the array");
        else
            System.out.println("Element is present at index:"+res2);
    }

    private static int recursiveBinarySearch(int[] arr, int x,int low,int high) {
        if(low<=high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == x)
                return mid;
            if (arr[mid] > x)
                return recursiveBinarySearch(arr, x, 0, mid - 1);

            return recursiveBinarySearch(arr, x, mid + 1, high);
        }
        return -1;
    }

    private static int iterativeBinarySearch(int[] arr, int x) {
        int low=0,high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==x)
                return mid;
            if(arr[mid]<x)
                low=mid+1;
            else
                high=mid-1;

        }
        return -1;
    }
}
