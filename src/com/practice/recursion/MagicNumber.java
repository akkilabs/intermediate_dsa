package com.practice.recursion;

public class MagicNumber {

    //method to check if A is magic number or not
    public int isMagicNumber(int A) {
        int singleDigit = sumOfDigits(A);
        return singleDigit == 1 ? 1 : 0;
    }

    // recursive method to reduce given number A to single digit
    public int sumOfDigits(int A) {

        //Base Condition
        if (A == 0) return 0;
        if (A == 1) return 1;

        //Break down the digits recursively to single digit
        int result = sumOfDigits(A / 10) + A % 10;

        // if result is already a single digit return it
        if (result / 10 == 0) {
            return result;
        }
        //else recurse again on the sum
        return sumOfDigits(result);
    }

    // Other Approach - Mathematical shortcut using modulo 9
    //For a magic number, we specifically want the digital root to equal 1.-So the check simplifies
     /*if(A%9==1)
         return 1;
        else
        return 0;  */

    public static void main(String[] args) {
        MagicNumber magicNumber = new MagicNumber();
        System.out.println(magicNumber.isMagicNumber(123)); // Output: 0
        System.out.println(magicNumber.isMagicNumber(37)); // Output: 1
        System.out.println(magicNumber.isMagicNumber(38)); // Output: 0
    }
}
