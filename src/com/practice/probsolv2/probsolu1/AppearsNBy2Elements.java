// In given array of N elements find the element which appears more than N/2 times and return it else return -1

// we can solve using HashMap by counting frequency of each element - TC : O(N) SC: O(N)

// We can solve using Moore's Voting Algo - TC : O(N) SC: O(1)

//*
// Moore's ALgo : Majority element occurring more than N/2 times, which means count of all other elements is less than N/2
// So select a element for majority element and when the other element(s) is same as selected element
// we need to increment votes if we get different elements then votes are decremented */

package com.practice.probsolv2.probsolu1;

public class AppearsNBy2Elements {
    public static void main(String[] args) {
        int[] arr = {5, 7, 4, 7, 4, 4, 5, 4, 4};
        int n = arr.length;
        System.out.println(appearsNBy2(arr, n));
    }

    private static int appearsNBy2(int[] arr, int n) {
        int result = arr[0];
        int count = 1;
        for (int i = 1; i < n; i++) {

            if (result == arr[i])
                count++;
            else
                count--;
            if (count == 0)
                result = arr[i];
            count = 1;
        }

        count = 0;
        for (int val : arr) {
            if (val == result)
                count++;
        }
        if (count > n / 2)
            return result;
        return -1;
    }
}
