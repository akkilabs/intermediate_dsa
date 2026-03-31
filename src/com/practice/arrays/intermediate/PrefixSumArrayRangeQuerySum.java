// Problem Statement
// Given N array elements and Q queries on same array.
// For each query calculate sum of all elements in given range [ L -> R, where L <= R ]
//Brute Force Approach TC : O(Q) * O(N) SC: O(1)

package com.practice.arrays;

import java.util.Scanner;

public class PrefixSumArrayRangeQuerySum {
    public static void main(String[] args) {
        int[] arr = {-3, 6, 2, 4, 5, 2, 8,};
        int n = arr.length;
        //int[] prefSum = new int[n];

        //invoking function
        int[] prefixSum = fillPrefixSum(arr, n);

        //Optimised Approach using PrefixSumArray technique Overall TC : O(Q+N) SC: O(N)

        System.out.print("Enter num of queries:");
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        while (q-- > 0) {
            System.out.println("Enter range :");
            int l = sc.nextInt();
            int r = sc.nextInt();
            int ans = prefixSum[r] - prefixSum[l - 1];
            System.out.println("SUM " + ans);
        }
    }

    //Filling PreFixSum Array - TC : O(N) SC: O(N)
    private static int[] fillPrefixSum(int[] arr, int n) {
        arr[0] = arr[0];
        for (int i = 1; i < n; i++) {
            arr[i] = arr[i - 1] + arr[i];
        }
        //printing PreFixSum Array Elements - just for our visualization not required as per problem statement
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println(" ");
        return arr;
    }

}
