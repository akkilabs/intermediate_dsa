package com.practice.arrays;

public class MaxConsecutiveOnes {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
            } else {
                count = 0;
            }
            max = Math.max(count, max);
        }
        return max;
    }

    // TC: O(N) SC: O(1)
    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 1, 1, 1};
        int max1s = findMaxConsecutiveOnes(nums);
        System.out.println("MaxConsecutiveOnes Count:::" + max1s);
    }
}