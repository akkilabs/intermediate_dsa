package com.practice.arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

//Two Sum OR CheckPair Problem in given Array
public class CheckPair {
    /*
    //Brute Force Approach
        public static boolean isPairExist(int[] nums, int k) {
            for (int i = 0; i < nums.length - 1; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] + nums[j] == k) {
                        return true;
                    }
                }
            }
            return false;
        }
    //TC: O(N^2) SC: O(1)*/
/*
    The idea is to use the two-pointer technique. But for using the two-pointer technique, the array must be sorted.
    Once the array is sorted the two pointers can be taken as starting and ending of the array respectively.
    If the sum is greater than the sum of those two elements, shift the end pointer towards left to decrease the value of the required sum and
    if the sum is lesser than the required value, shift the start pointer towards right to increase the value of the required sum.*/
/*
    public static boolean isPairExist(int[] nums, int k) {
        Arrays.sort(nums);
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            if (nums[start] + nums[end] == k) {
                return true;
            } else if (nums[start] + nums[end] < k) {
                start++;
            } else if (nums[start] + nums[end] > k) {
                end--;
            }
        }
        return false;
    }
*/
    // TC: O(NlogN) [TC for sorting the array] SC: O(1)

    // Optimised Approach
    public static boolean isPairExist(int [] nums,int k){
        Set<Integer> hs = new HashSet<>();
        for (int i=0; i<nums.length; i++){
            int temp = k-nums[i];
            if (hs.contains(temp)){
                return true;
            }
            hs.add(nums[i]);
        }
        return false;
    }
//TC:O(N): As the whole array need to be traversed at least once
//SC:0(N):A HashSet has been created to store array elements.

    public static void main(String[] args) {
        int[] nums = {0, -1, 2, -3, 1};
        int k = -2;
        System.out.println(isPairExist(nums, k));
    }
}