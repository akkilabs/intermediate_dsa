package com.practice.sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {2, 8, 4, -1, 7, 10, 5, 6};
        selectionSort(arr);
    }

    private static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minVal = arr[i];
            int minIndx = i;

            for (int j = i + 1; j < n; j++) {
                if (minVal > arr[j]) {

                    // updating minVal and minIndx values after traversing the given array

                    minVal = arr[j];
                    minIndx = j;
                }
            }

            // re-arranging the given array with updated minVal and minIndx values

            int temp = arr[i];
            arr[i] = arr[minIndx];
            arr[minIndx] = temp;
        }

        for (int val : arr) {
            System.out.print(val + " ");
        }
    }
}