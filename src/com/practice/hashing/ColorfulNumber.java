package com.practice.hashing;

import java.util.HashSet;
import java.util.Set;

public class ColorfulNumber {
    public static void main(String[] args) {
        int number = 3245;
        System.out.println(isColorfulNumber(number));
    }

    private static int isColorfulNumber(int number) {
        Set<Integer> products = new HashSet<>();
        String num = "" + number;
        int n = num.length();
        for (int i = 0; i < n; i++) {
            int product = 1;
            for (int j = i; j < n; j++) {
                product = product * (num.charAt(j) - '0');
                if (products.contains(product))
                    return 0;
                products.add(product);
            }
        }
        System.out.println("Colorful Number Products >>>" + products);
        return 1;
    }
}
