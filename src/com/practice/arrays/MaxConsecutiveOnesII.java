package com.practice.arrays;

public class MaxConsecutiveOnesII {
    /**
     * We need to replace at most one 0 with 1 to get the maximum consecutive 1s in the array:
     * {0,1,1,1,0,1,1,0,1,1,0}
     * Using the sliding window technique:
     * 1. Start with both pointers at the beginning.
     * 2. Maintain a count of zeros in the current window.
     * 3. Slide the window to the right. When the count of zeros exceeds 1, move the left pointer right until the count becomes 1.
     * 4. At each step, calculate the window size and track the maximum.
     * From this method, the maximum length of consecutive 1s we can get by replacing at most one 0 is 6.
     **/
    public static int findMaxConsecutiveOnes(int[] nums) {
        int maxConsecutiveOnes = 0;
        int start = 0;
        int k = 1; // Represents we can flip at most one 0
        int zeroCount = 0;
        // Move end pointer/index and if zero is found, then increment zeroCount
        for (int end = 0; end < nums.length; end++) {
            if (nums[end] == 0) {
                zeroCount++;
            }
        /*  if the value of zeroCount is greater than k,
            move start pointer and reset the window   */
            while (zeroCount > k) {
                if (nums[start] == 0) {
                    zeroCount--;
                }
                start++;
            }
            maxConsecutiveOnes = Math.max(maxConsecutiveOnes, end - start + 1);
        }
        return maxConsecutiveOnes;
    }

    // TC: O(N) SC: O(1)
    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 0, 1, 1, 1, 1, 1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }
}