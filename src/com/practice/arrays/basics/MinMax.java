package com.practice.arrays.basics;

public class MinMax {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 1, 11};
        int n = arr.length;
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] < min) min = arr[i];
            if (arr[i] > max) max = arr[i];
        }
        System.out.println("Min: " + min + " Max: " + max); //TC: O(N) SC: O(1)
    }
}
