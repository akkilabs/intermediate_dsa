package com.practice.arrays;

import java.util.Arrays;

public class PrefixOddIndicesSum {
    public static void main(String[] args) {
        int[] arr = {3, -2, 4, 6, -3, 5, 8};
        int n = arr.length;
        //declaring prefixOdd Array
        int[] prefixOdd = new int[n];
        //invoking function to fill prefixOdd Array
        prefixOdd = buildPrefixOdd(arr, n, prefixOdd);
        System.out.println(Arrays.toString(prefixOdd));
    }

    //building prefixOdd Array - TC : O(N) SC: O(N)
    private static int[] buildPrefixOdd(int[] arr, int n, int[] prefixOdd) {
        prefixOdd[0] = 0; //index "0" is even, so odd sum starts "0"
        for (int i = 1; i < n; i++) {
            if (i % 2 != 0) {
                prefixOdd[i] = prefixOdd[i - 1] + arr[i]; //if it is odd index add previous index value and current index value
            } else {
                prefixOdd[i] = prefixOdd[i - 1]; //if it is even index just copy previous index value
            }
        }
        return prefixOdd;
    }
}
