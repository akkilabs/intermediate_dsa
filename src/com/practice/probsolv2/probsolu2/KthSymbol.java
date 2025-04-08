package com.practice.probsolv2.probsolu2;

public class KthSymbol {

    static int kthSymbol(int i, int j) {
        if (i == 1 && j == 1) {
            return 0;
        }
        int no_of_elements = (int) Math.pow(2, i - 1); // TODO : we can replace this with left shift operator (1 << i-1)
        int mid = no_of_elements / 2;

        // If j is in the first half of the current row
        if (j <= mid) {
            return kthSymbol(i - 1, j); // same as in previous row
        } else {
            //If j is in the second half, it is the complement of the previous row
            return 1 - kthSymbol(i - 1, j - mid); // it will give 1s complement (0 becomes 1, and 1 becomes 0)

            //return kthSymbol(i - 1, j - mid) == 0 ? 1 : 0; // using ternary operator also we will return same as above step
        }
    }

    public static void main(String[] args) {
        int i = 4; // Row number
        int j = 5; // Kth Symbol (column) in row
        System.out.println("The " + j + "th symbol in row " + i + " is: " + kthSymbol(i, j));
    }
}
