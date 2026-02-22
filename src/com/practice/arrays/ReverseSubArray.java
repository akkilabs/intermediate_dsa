package com.practice.arrays;

import java.util.Arrays;

//Reverse Array in a range OR Reverse subarray problem
//solved by using two pointers technique

//Alternative Approaches:
//Collections.swap(): If you wrap the array in a List (Arrays.asList()), you can use Collections.swap() for readability.

public class ReverseSubArray {
    public static void main(String[] args) {
        int[] arr = {-3, 4, 2, 8, 7, 9, 6, 2, 10};
        int left = 3;
        int right = 7;
        if (left >= 0 && right < arr.length && left <= right) {  //written to check conditions before proceeding reverse subarray
            reverseSubArray(arr, left, right);
        }
        System.out.println("Reversed SubArray is ::: ");
/*        for (int i : arr) {
            System.out.print(i + " ");
        }*/
        System.out.println(Arrays.toString(arr)); // another way printing array elements

    }

    //TC: O(N) SC:O(1)
    private static void reverseSubArray(int[] A, int si, int ei) {
        if (A == null || A.length == 0) return;
        // int si =0;
        // int ei = A.length-1;
        int temp = 0;
        while (si < ei) {
            temp = A[si];
            A[si] = A[ei];
            A[ei] = temp;
            si++;
            ei--;
        }
    }
}
