package com.practice.sorting;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * This class is to find Noble Integer for given problem statement
 * * Given an integer array A, find if an integer p exists in the array such that the number of integers
 * * greater than p in the array equals p.
 * Author:Akki
 * Version:2.0
 * InOrderTraversal follows this order LST | root | RST
 */
public class NobleInteger2 {
    public static void main(String[] args) {
        int[] A = {3, 2, 1, 3};
        int res = findNobleInteger(A);
        System.out.println(res);
    }

    // Method to find NobleInteger - if found return 1 else -1
    //Optimised Approach - TC: O(Nlogn) SC: O(1)
    private static int findNobleInteger(int[] a) {
        int n = a.length;
        Arrays.sort(a);

        for (int i = 0; i < n; i++) {
            int countGreater = n - (i + 1); // Count elements greater than A[i]
            if (countGreater == a[i]) {
                return 1;
            }
        }
        return -1;
    }


    //Method to find NobelInteger - if found return 1 else -1
    //Brute Force Approach - TC : O(N^2) SC : O(1)
/*    private static int findNobleInteger(int[] a) {
        // Use a HashSet to store unique elements
        Set<Integer> uniqueNumbers = new HashSet<>();
        for (int num : a) {
            uniqueNumbers.add(num);
        }
        //Iterate through unique elements
        for (int p : uniqueNumbers) {
            // count numbers greater than p
            int countGreater = 0;
            for (int num : a) {
                if (num > p) {
                    countGreater++;
                }
            }
            if (countGreater == p) {
                return 1;
            }
        }
        return -1;
    }*/
}
