package com.practice.hashing;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 2, 5};
        //int[] arr = {1, 2, 3, 1, 2}; //SingleNonRepeatedElement Array
        int n = arr.length;
        System.out.println(firstNonRepeatingElement(arr, n));
    }

    // Approach1: TC - O(N^2) SC - O(1)
/*    private static int firstNonRepeatingElement(int[] arr, int n) {
        for(int i=0; i<n; i++){
            int j; // Declaring local variable
            for(j=0; j<n; j++) // Initialising just before using it
                if(i!=j && arr[i] == arr[j])
                    break;
            if(j==n)
                return arr[i];
        }
        return -1;
    }*/

    //Approach2: By Using HashMap: TC - O(N) SC - O(N)
    private static int firstNonRepeatingElement(int[] arr, int n) {

        //Insert all the elements in to HashMap
        Map<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (hm.containsKey(arr[i])) {
                hm.put(arr[i], hm.get(arr[i]) + 1);
            } else {
                hm.put(arr[i], 1);
            }
        }

        //Traverse the array again and return first element with count 1
        for (int i = 0; i < n; i++) {
            if (hm.get(arr[i]) == 1)
                return arr[i];
        }
        return -1;
    }

    /*Using Bit Manipulation - This approach only SingleNonRepeatedElement.
    If we have more than one NonRepeatedElement it won't work.

    As we know XOR operation with 0 gives the same number
    i.e, a XOR 0 = a
    eg, for decimal no. 2=> 2 XOR 0 = 2
    in binary, 010 XOR 000 = 010

    Also we know that , XOR operation with same number gives 0
    i.e, a XOR a = 0
    eg, 2 XOR 2 = 0
    in binary, 010 XOR 010 = 000

    XOR is associative (like sum)
    i.e, (2 XOR 3) XOR 4 = 2 XOR (3 XOR 4), So the order doesn't matter in performing XOR operation.
    eg, 2^3^4^6 = 3^2^6^4 = 4^2^6^3 ......

    So, using these three properties of XOR , we will solve the question. we will take ans variable with 0 as initial value.
    And then for each element i in array, we will perform the XOR operation of the element with 0,
    ans will become 0 if the same number is found (as a XOR a = 0) and
    so after the completion of the loop, only element with no duplicate number will remain and will be returned as ans.*/

/*   private static int firstNonRepeatingElement(int[] arr, int n) {
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = ans^arr[i];
        }
        return ans;
    }*/
}