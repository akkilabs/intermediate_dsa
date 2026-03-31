// Given N array elements, construct a pfEven[] of size N
// pfEven[i] = sum of all even indices from [ 0, i ]

package com.practice.arrays.intermediate;

import java.util.Arrays;

public class PrefixEvenIndicesSum {
    public static void main(String[] args) {
        int[] arr = {3, -2, 4, 6, -3, 5,8};
        int n = arr.length;
        //declaring prefixEven Array
        int[] prefixEven = new int[n];
        //invoking function to fill prefixEven Array
        prefixEven = buildPrefixEven(arr, n, prefixEven);
        System.out.println(Arrays.toString(prefixEven));
    }

    //building prefixEven Array - TC : O(N) SC: O(N)
    private static int[] buildPrefixEven(int[] arr, int n, int[] prefixEven) {
        prefixEven[0] = arr[0];//index "0" is even
        for (int i = 1; i < n; i++) {
            if (i % 2 == 0)
                prefixEven[i] = prefixEven[i - 1] + arr[i];//if it is even index add previous index value and current index value
            else
                prefixEven[i] = prefixEven[i - 1];//if it is odd index just copy previous index value
        }
        return prefixEven;
    }

}