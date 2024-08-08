// In given array of N elements find the element which appears more than N/3 times and return it else return -1

// we can solve using HashMap by counting frequency of each element - TC : O(N) SC: O(N)

// We can solve using Moore's Voting Algo - TC : O(N) SC: O(1)

//*
// Moore's ALgo : Majority element occurring more than N/3 times, which means count of all other elements is less than N/3
// So select a element for majority element and when the other element(s) is same as selected element
// we need to increment votes if we get different elements then votes are decremented*
// we have taken initiative from N/2 problem and applied below approach for N/3 problem */


package com.practice.probsolv2.probsolu1;

public class AppearsNBy3Elements {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 3, 3, 2, 2, 2};
        int n = arr.length;
        appearsNBy3(arr, n);
    }

    private static void appearsNBy3(int[] arr, int n) {
        int count1 = 0;
        int count2 = 0;
        int flag = 0;

        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            // If this element is previously seen - increment the count value
            if (first == arr[i])
                count1++;

                // If this element is previously seen - increment the count value
            else if (second == arr[i])
                count2++;

            else if (count1 == 0) {
                count1++;
                first = arr[i];
            } else if (count2 == 0) {
                count2++;
                second = arr[i];

            }
            // if current element is different
            // from both the previously seen
            // variables, decrement both the counts.
            else {
                count1--;
                count2--;
            }
        }

        //Again traverse through array and find actual counts
        count1 = 0;
        count2 = 0;
        for (int i = 0; i < n; i++) {
            if (first == arr[i])
                count1++;
            if (second == arr[i])
                count2++;
        }
        if (count1 > n / 3) {
            System.out.print(first + " ");
            flag = 1;
        }
        if (count2 > n / 3) {
            System.out.print(second + " ");
            flag = 1;
        }
        if (flag == 0)
            System.out.println("No elements appeared greater than N/3 times");
    }
}