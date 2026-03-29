//Google Special Index : HARD
//An index is said to be special index, if after deleting it
//sum of all even indices = sum of all odd indices
//count how many such special indices are there and return

package com.practice.arrays.advanced;

public class SpecialIndex {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 6, -2};
        int count1 = specialIndexBruteForce(arr);
        System.out.println("Number of special indices (BruteForce): " + count1);
        int count2 = specialIndexOptimized(arr);
        System.out.println("Number of special indices (Optimized): " + count2);
    }

    /**
     * Idea / Approach - Brute Force
     * For each index i, simulate deletion.
     * Rebuild the array without arr[i].
     * Compute sum of even indices and odd indices.
     * If equal → count it
     * <p>
     * TC: O(N^2) SC: O(1)
     */
    private static int specialIndexBruteForce(int[] arr) {
        int n = arr.length;
        if (n <= 1) return 0; //edge case: empty or single element array
        int count = 0;
        for (int i = 0; i < n; i++) {
            int se = 0, so = 0; //sum of even and odd indices
            int indx = 0; // new index after deletion

            for (int j = 0; j < n; j++) {
                if (j == i)
                    continue; // it skips below logic and goes to next index [for this problem this is the indx we will delete and checks se and so]
                if (indx % 2 == 0)
                    se += arr[j];
                else
                    so += arr[j];
                indx++;

            }
            if (se == so)
                count++;
        }
        return count;
    }

    /**
     * Optimized Approach / Idea
     * Precompute prefix sums for even and odd indices.
     * For each index i, deletion shifts parity of all elements after i.
     * Use prefix sums to calculate sums before and after i efficiently.
     * <p>
     * TC: O(N) SC: O(N)
     */
    private static int specialIndexOptimized(int[] arr) {
        int n = arr.length;
        if (n <= 1) return 0; //edge case: empty or single element array

        //construct pfEven and pfOdd arrays
        int[] pfEven = new int[n];
        int[] pfOdd = new int[n];

        pfEven[0] = arr[0];
        pfOdd[0] = 0;
        for (int i = 1; i < n; i++) {
            if (i % 2 == 0) {
                pfEven[i] = pfEven[i - 1] + arr[i];
                pfOdd[i] = pfOdd[i - 1];
            } else {
                pfOdd[i] = pfOdd[i - 1] + arr[i];
                pfEven[i] = pfEven[i - 1];
            }
        }
        int count = 0; // count of special indices

        for (int i = 0; i < n; i++) {
            // Se = sum of even indices before i + sum of odd indices after i
            int se = (i == 0 ? 0 : pfEven[i - 1]) + (pfOdd[n - 1] - pfOdd[i]);   //here we can use totalOdd also
            // So = sum of odd indices before i + sum of even indices after i
            int so = (i == 0 ? 0 : pfOdd[i - 1]) + (pfEven[n - 1] - pfEven[i]);  //here we can use totalEven also
            if (se == so)
                count++;
        }
        return count;
    }
}
