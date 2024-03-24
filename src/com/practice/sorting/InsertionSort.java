package com.practice.sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int [] arr = {3,10,6,2,4};
        insertionSort(arr);
    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i=1;i<n;i++){
            int key = arr[i];
            int j = i-1;

            while (j >= 0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j--;
            } // By end of while loop, cursor is pointing at the index smaller than key
            arr[j+1] = key;
        }

        for (int val:arr)
            System.out.print(val+" ");
    }
}
