/**
 * Rearrange the array so that all negative numbers come before all positive numbers.
 * Order among negatives/positives doesn’t matter.
 * <p>
 * Approach (Two‑Pointer / Partitioning)
 * </p>
 * Use two pointers: left at start, right at end.
 * If arr[left] is negative, move left++.
 * If arr[right] is positive, move right--.
 * If arr[left] is positive and arr[right] is negative → swap
 */

package com.practice.arrays.basics;

import java.util.Arrays;

public class PartitionNegPositives {
    public static void main(String[] args) {
        int[] arr = {1, -2, 3, -4, -5, 6};
        partition(arr);
        System.out.println("Partitioned Array: " + Arrays.toString(arr));
    }

    private static void partition(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            if (arr[left] < 0) {
                left++;
            } else if (arr[right] >= 0) {
                right--;
            } else {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }
}
