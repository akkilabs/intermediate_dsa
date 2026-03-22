package com.practice.arrays.basics;

import java.util.Arrays;

public class Traversal {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9};
        int n = arr.length;
        System.out.println(Arrays.toString(arr));

        //Forward Traversal - TC: O(N) SC: O(1)
        System.out.print("Forward Traversal: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        //Backward Traversal - TC: O(N) SC: O(1)
        System.out.print("\nBackward Traversal: ");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

    }
}
