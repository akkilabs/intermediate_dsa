/**
 * Given a sorted array, remove duplicates in‑place and return the new length.
 * <p>Approach (Two‑Pointer)</p>
 *
 * Maintain index for unique elements.
 * Traverse array: if arr[i] != arr[index], increment index and copy arr[i].
 * After loop, index+1 elements are unique.
 *
 * <p>
 * TC: O(N) SC: O(1)
 * </p>
 */

package com.practice.arrays.basics;


public class RemoveDuplicatesSorted {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 4, 4, 5};
        int newLength = removeDuplicates(arr);
        System.out.println(newLength);
        // Print only the newLength elements without creating a new array
        System.out.print("Array after removing duplicates: [");
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i]);
            if (i < newLength - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    private static int removeDuplicates(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        int index = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[index]) {
                index++;
                arr[index] = arr[i];
            }
        }
        return index + 1; //new length
    }
}
