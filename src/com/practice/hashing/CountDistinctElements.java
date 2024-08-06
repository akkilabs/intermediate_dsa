// Count all distinct elements in given array of N elements

package com.practice.hashing;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CountDistinctElements {
    public static void main(String[] args) {
        int[] arr = {6, 3, 7, 3, 8, 6, 9};
        int n = arr.length;
        System.out.println(countDistinct(arr, n));
    }

    //Approach 1: Traverse the sorted array
    // TC : O(NlogN) SC : O(1)
/*
    private static int countDistinct(int[] arr, int n) {
        Arrays.sort(arr);
        int result = 0;
        for (int i = 0; i < n; i++) {
            //Move the index ahead while there are duplicates
            while (i < n - 1 && arr[i] == arr[i + 1]) {
                i++;
            }
            result++;
        }
        return result;
    }
*/

    // Approach 2: Traversing the array and adding each element to HashSet
    // TC : O(N) SC : O(N)
    private static int countDistinct(int[] arr, int n) {
        Set<Integer> hs = new HashSet<>();
        for (int i = 0; i < n; i++) {
            hs.add(arr[i]);
        }
        return hs.size();
    }
}
