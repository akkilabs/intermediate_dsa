/*
*** Problem Statement ***
Given N array elements and Q queries. For each query And frequency of each element in given queries
*/

package com.practice.hashing;

import java.util.HashMap;
import java.util.Map;

// Java program to count frequencies of array elements
public class FrequencyNums {
    static void countFreq(int[] arr, int n) {
        Map<Integer, Integer> hm = new HashMap<>();

        // Traverse through array of elements and count frequencies - TC: O(N) SC: O(N)
        for (int i = 0; i < n; i++) {
            if (hm.containsKey(arr[i])) {
                hm.put(arr[i], hm.get(arr[i]) + 1);
            } else {
                hm.put(arr[i], 1);
            }
        }
        // Traverse through map and print frequencies
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    // Driver code
    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};
        int n = arr.length;
        countFreq(arr, n);
    }
}
