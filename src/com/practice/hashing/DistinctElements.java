package com.practice.hashing;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DistinctElements {
    public static void main(String[] args) {
        Integer[] arr = {5, 6, 1, 2, 3, 5};
        if (areDistinctElements(arr))
            System.out.println("All are distinct elements");
        else
            System.out.println("Not all elements are distinct");
    }
    // TC : O(N)  SC : O(N)
    private static boolean areDistinctElements(Integer[] arr) {
        //put all array elements in to HashSet
        Set<Integer> hs = new HashSet<>(Arrays.asList(arr));
        //if all elements are distinct size of hashset should be same as given array
        return (hs.size() == arr.length);
    }
}
