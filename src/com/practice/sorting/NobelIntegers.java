package com.practice.sorting;

import java.util.Arrays;

public class NobelIntegers {
    public static void main(String[] args) {
        //int[] arr = {1, -5, 3, 5, -10, 4}; // with distinct elements   //output : 3
        int[] arr = {-10, 1, 1, 1, 4, 4, 4, 7, 10}; // with duplicate/repeated elements   //output : 7
        int ans = countNobles(arr);
        System.out.println("Num of Noble Integers in given array::" + ans);
    }

    //Brute Force Approach: For every element iterate and get no of elements < arr[i]
    //TC : O(N^2) and SC: O(1)

/*    private static int countNobles(int[] arr) {
        System.out.println(Arrays.toString(arr));
        int res = 0;
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        for (int i : arr) {
            int count = 0;
            for (int j : arr) {
                if (j < i)
                    count++;
            } // end of inner for loop
            if (count == i)
                res++;
        } // end of outer for loop
        return res;
    }*/


    // Optimized Approach - TC : O(Nlogn) and SC: O(1)
    private static int countNobles(int[] arr) {
        int result = 0;
        int n = arr.length;
        int count = 0;
        Arrays.sort(arr);
        if (arr[0] == 0)
            result++;
        for (int i = 1; i < n; i++) {

            // observation1: if element is repeating - lesser_element_count won't changes
            // observation2: if element is coming for first time - lesser_element_count < arr[i] = i

            if (arr[i] != arr[i - 1]) //arr[i] coming for first time
                count = i;
            if (arr[i] == count)
                result++;
        }
        return result;
    }
}
