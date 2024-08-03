package com.practice.sorting;

import java.util.Arrays;
import java.util.Comparator;

public class FactorsSort {
    public static void main(String[] args) {
        int[] arr = {9,17,6,4};
        factorsSort(arr, arr.length);
    }

    private static void factorsSort(int[] arr, int n) {
        Integer[] no_of_facts = new Integer[n];
        for (int i = 0; i < n; i++) {
            no_of_facts[i] = arr[i];
        }
        Arrays.sort(no_of_facts, FactorsSort::factorsCompare);
        System.out.println("Sorted Based On Factors:::" + Arrays.toString(no_of_facts));

    }

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

    private static int countFactors(int num) {
        int factors=0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0)
                factors++;
        }
        return factors;
    }
}