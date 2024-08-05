/*
** ***** Problem Statement *****
 Given N array elements sort them in increasing/ascending order based on their num of factors
 if two elements have equal num of factors, element with less value should come first
 without using extra space
 **
*/


package com.practice.sorting;

import java.util.Arrays;

public class FactorsSort {
    public static void main(String[] args) {
        int[] arr = {9, 17, 6, 4};
        factorsSort(arr, arr.length);
    }

    // sorting based on number of factors - TC: O(NlogN) SC: O(1)
    private static void factorsSort(int[] arr, int n) {
        //converting primitive array to wrapper objects array in order to pass args to compare method
        Integer[] no_of_facts = new Integer[n];
        for (int i = 0; i < n; i++) {
            no_of_facts[i] = arr[i];
        }
        Arrays.sort(no_of_facts, FactorsSort::factorsCompare);
        System.out.println("Sorted Based On Factors:::" + Arrays.toString(no_of_facts));

    }

    // comparing based on no of factors - if number of factors are equal for two nums - compare based on their values
    private static int factorsCompare(Integer num1, Integer num2) {
        int count1 = countFactors(num1);
        int count2 = countFactors(num2);

        if (count1 < count2)
            return -1;

        else if (count1 == count2) {
            if (num1 < num2) {
                return -1;
            } else
                return 1;
        } else
            return 1;
    }

    // finding number of factors in optimized approach
    private static int countFactors(int num) {
        int factors = 0;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0)
                if (i * i == num)
                    factors++;
                else {
                    factors = factors + 2;
                }
        }
        return factors;
    }
}