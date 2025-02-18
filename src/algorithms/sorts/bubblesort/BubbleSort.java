package algorithms.sorts.bubblesort;

import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] arr){
        for(int i=arr.length-1;i>=0;i--){
            for(int j=0;j<i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] array ={1,6,4,8,9,2,3,7,10};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
}
