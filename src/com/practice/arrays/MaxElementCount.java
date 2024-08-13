// Given an array of size N elements, count the no. of elements which at least 1 element greater-than themselves

//Only the maximum element will not have a greater element
//cMax -> count the max elements
//N - cMax ->is the result, where N is the total nu of elements of an Array.

package com.practice.arrays;

public class MaxElementCount {

    // TC : O(N) SC: O(1)
    public static void main(String[] args) {
        int[] arr = {-3, 8, -2, 6, 8, 4, 8, 5};
        int n = arr.length;
        //Find Maximum Number
        int max = arr[0];
        int cMax = 1;

        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
                cMax = 1;
            } else if (arr[i] == max) {
                cMax++;
            }

        }
        int ans = n - cMax;
        System.out.println("Result After Subtracting MaxElementCount >>> " + ans);

    }
}
