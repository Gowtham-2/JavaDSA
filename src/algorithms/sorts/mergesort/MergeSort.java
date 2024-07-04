package algorithms.sorts.mergesort;

import java.util.Arrays;

public class MergeSort {
    public static int[] mergeSort(int[] arr){
        if(arr.length==1) return arr;
        int midIndex=arr.length/2;
        int[] left=mergeSort(Arrays.copyOfRange(arr,0,midIndex));
        int[] right=mergeSort(Arrays.copyOfRange(arr,midIndex,arr.length));
        return merge(left,right);
    }
    public static int[] merge(int[] arr1,int[] arr2){
        int[] combinedArray=new int[arr1.length+arr2.length];
        int index=0;
        int i=0,j=0;
        while(i< arr1.length&&j< arr2.length){
            if(arr1[i]<arr2[j]){
                combinedArray[index++]=arr1[i++];
                //index++;
                //i++;
            }else {
                combinedArray[index++]=arr2[j++];
            }
        }
        while(i< arr1.length){
            combinedArray[index++]=arr1[i++];
        }
        while (j< arr2.length){
            combinedArray[index++]=arr2[j++];
        }
        return combinedArray;
    }
    public static void main(String[] args) {
        int[] arr={3,2,6,8,5};
        int[] sortedArray=mergeSort(arr);
        System.out.println("Original Array:"+Arrays.toString(arr));
        System.out.println("Sorted Array:"+Arrays.toString(sortedArray));
    }
}
