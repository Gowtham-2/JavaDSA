package algorithms.sorts.quicksort;

import java.util.Arrays;

public class QuickSort {
    public static int pivot(int[] array,int pivotIndex,int end){
        int swapIndex=pivotIndex;
        for(int i=pivotIndex+1;i<=end;i++){
            if(array[pivotIndex]>array[i]){
                swapIndex++;
                swap(array,swapIndex,i);
            }
        }
        swap(array,swapIndex,pivotIndex);
        return swapIndex;
    }
    private static void swap(int[] array,int firstIndex,int secondIndex){
        int temp=array[firstIndex];
        array[firstIndex]=array[secondIndex];
        array[secondIndex]=temp;
    }
    public static void quickSort(int[] array){
        quickSortHelper(array,0,array.length-1);
    }

    private static void quickSortHelper(int[] array, int left, int right) {
        if(left<right){
            int pivotIndex=pivot(array, left, right);
            quickSortHelper(array,left,pivotIndex-1);
            quickSortHelper(array, pivotIndex+1, right);
        }
    }

    public static void main(String[] args) {
        int[] array={4,6,1,7,3,5,2};
        quickSort(array);
        System.out.println(Arrays.toString(array));

    }
}
