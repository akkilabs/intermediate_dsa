// Given an array of size N elements, count the no. of elements having at least 1 element greater-than itself

/**
 * Only the maximum element will not have a greater element
 * For every other element apart from max, will have at least one element greater than itself
 * iterate and get the max element  ---> maxElement
 * iterate and get num of elements != maxElement
 * implemented this approach in two for loops.
 */

package com.practice.arrays.intermediate;

public class CountGreaterElements {

    // TC : O(N) SC: O(1)
    public static void main(String[] args) {
        int[] arr = {-3, 8, -2, 6, 8, 4, 8, 5};
        int n = arr.length;
        /**
         * intuition is to do this logic in one loop
         * find maximum number
         * once we find max number we are resetting cMax to 1
         * at the end of loop we will subtract final max element from length of array, and we will return
         * it count of greater elements
         */
        int max = arr[0];
        int cMax = 1;   // resetting it to 1

        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
                cMax = 1;
            } else if (arr[i] == max) {
                cMax++;
            }

        }
        int ans = n - cMax;
        System.out.println("Result After Subtracting CountGreaterElements >>> " + ans);

        //Another approach - with two loops - TC : O(N) SC : O(1)
        int count = countGreaterElements(arr);
        System.out.println("count of greater elements: " + count);

    }

    private static int countGreaterElements(int[] arr) {
        int n = arr.length;
        int maxElement = Integer.MIN_VALUE;

        for (int i : arr) {  // TC : O(N)
            if (i > maxElement) {
                maxElement = i;
            }
        }
        int count = 0;
        for (int i = 0; i < n; i++) { //TC : O(N)
            if (arr[i] != maxElement) {
                count++;
            }
        }
        return count;
    }
}
