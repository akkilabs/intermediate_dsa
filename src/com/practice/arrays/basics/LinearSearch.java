package com.practice.arrays.basics;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9};
        int n = arr.length;
        int target = 7;
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                System.out.println("Found at index: " + i); //TC: O(N) SC: O(1)
                found = true;
                break;

            }
        }
        if (!found) {
            System.out.println("Not found");
        }
    }
}
