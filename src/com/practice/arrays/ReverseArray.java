package com.practice.arrays;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 7, 9, 11};
        int n = arr.length;
        reverseArray(arr, n);
    }
   //TC: O(N) SC:O(1)
    private static void reverseArray(int[] arr, int n) {

        for (int i = 0; i < n / 2; i++) {
            int j = n - 1 - i;

            //swap two variables using XOR operator
            arr[i] = arr[i] ^ arr[j];
            arr[j] = arr[i] ^ arr[j];
            arr[i] = arr[i] ^ arr[j];

            //swap two variables without using third variable
//            arr[i] = arr[i] + arr[j];
//            arr[j] = arr[i] - arr[j];
//            arr[i] = arr[i] - arr[j];

            //swap two variables without using third variable
//            arr[i] = arr[i] * arr[j];
//            arr[j] = arr[i] / arr[j];
//            arr[i] = arr[i] / arr[j];

            //swap two variables using temp variable
//            int temp = arr[i];
//            arr[i] = arr[j];
//            arr[j] = temp;
        }
        System.out.print("ReverseArray is ::: ");

        for (int k = 0; k < n; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}
