package com.practice.arrays.basics;

public class SumAverage {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9};
        int n = arr.length;
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        double avg = (double) sum / n;
        System.out.println("Sum: " + sum + ", Average: " + avg); // TC: O(N) SC: O(1)

    }
}
