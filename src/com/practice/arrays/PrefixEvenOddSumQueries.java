package com.practice.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class PrefixEvenOddSumQueries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //input array
        int[] arr = {3, -2, 4, 6, -3, 5, 8};
        int n = arr.length;

        //step1: build prefix arrays
        int[] pfEven = buildPrefixEven(arr);
        int[] pfOdd = buildPrefixOdd(arr);

        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("Prefix Even: " + Arrays.toString(pfEven));
        System.out.println("Prefix Odd: " + Arrays.toString(pfOdd));

        //step2: read queries dynamically
        System.out.println("Enter number of Queries: ");
        int Q = sc.nextInt();

        for (int q = 1; q <= Q; q++) {
            System.out.println("Enter L and R for query " + q + ":");
            int l = sc.nextInt();
            int r = sc.nextInt();

            if (l < 0 || r >= n || l > r) {
                System.out.println("Invalid query range");
            } else {
                int evenSum = rangeSum(pfEven, l, r);
                int oddSum = rangeSum(pfOdd, l, r);
                System.out.println("Query [" + l + "," + r + "]");
                System.out.println("sum of even indices : " + evenSum);
                System.out.println("sum of odd indices : " + oddSum);
            }
        }
        sc.close();
    }

    // Build prefix sum array for even indices TC : O(N) SC: O(N)
    private static int[] buildPrefixEven(int[] arr) {
        int[] pfEven = new int[arr.length];
        pfEven[0] = arr[0]; //index "0" is even
        for (int i = 1; i < arr.length; i++) {
            if (i % 2 == 0) {
                pfEven[i] = pfEven[i - 1] + arr[i];//if it is even index add previous index value and current index value
            } else {
                pfEven[i] = pfEven[i - 1]; //if it is odd index just copy previous index value
            }
        }
        return pfEven;
    }

    // Build prefix sum array for odd indices TC : O(N) SC: O(N)
    private static int[] buildPrefixOdd(int[] arr) {
        int[] pfOdd = new int[arr.length];
        pfOdd[0] = 0; //index "0" is even, so odd sum starts "0"
        for (int i = 1; i < arr.length; i++) {
            if (i % 2 != 0) {
                pfOdd[i] = pfOdd[i - 1] + arr[i];//if it is odd index add previous index value and current index value
            } else {
                pfOdd[i] = pfOdd[i - 1];//if it is even index just copy previous index value
            }
        }
        return pfOdd;
    }

    // Query: sum of indices between L and R using prefix array
    private static int rangeSum(int[] prefix, int l, int r) {
        if (l == 0)
            return prefix[r];
        return prefix[r] - prefix[l - 1];
    }
}
