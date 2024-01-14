package com.practice.arrays;

import java.util.HashSet;
import java.util.Set;

public class FindZeroSumSubArray {
    //Brute Force Approach
    public static boolean isZeroSumSubArrayExists(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int sum = arr[i];
            if (sum == 0)
                return true;
            for (int j = i + 1; j < n; j++) {
                sum += arr[j];
                if (sum == 0)
                    return true;
            }
        }
        return false;
    }
    // >>>>>>>>>>TC: O(N^2) SC: O(1)<<<<<<<<<<
    // Optimal Approach
    /* public static boolean isZeroSumSubArrayExists(int[] arr) {
        int sum = 0;
        Set<Integer> hs = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (arr[i] == 0 || sum == 0 || hs.contains(sum)) {
                return true;
            }
            hs.add(sum);
        }
        return false;
    } */
    //>>>>>>>>>>TC: O(N) SC: O(N)<<<<<<<<<< hence we are using extra space HS to store sum elements.

    public static void main(String[] args) {
        int[] arr = {4, 2, -3, -1, 0, 4};
        if (isZeroSumSubArrayExists(arr)) {
            System.out.println("zero sum subarray found");
        } else {
            System.out.println("zero sum subarray not found");
        }
    }

}