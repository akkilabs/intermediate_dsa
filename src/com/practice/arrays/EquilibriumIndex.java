// Given N array elements, count the no. of equilibrium indices.An index is said to be equilibrium index
// If sum of all elements before ith index equals to - sum [ 0, i-1 ]
// sum of all elements after ith index - sum [ i+1, N-1 ]

package com.practice.arrays;

public class EquilibriumIndex {
    public static void main(String[] args) {
        int[] A = {-7, 1, 5, 2, -4, 3, 0};
        //int[] A = {1, 2, 3};
        int N = A.length;
        int result = equilibriumIndex(A, N);
        System.out.println(result);

    }

    //Overall TC : O(N+N) = O(N) SC : O(N)
    private static int equilibriumIndex(int[] A, int N) {
        int leftSum = 0;
        int rightSum = 0;
        int ans = 0;

        //constructing PrefixSum Array - TC : O(N)
        int[] prefixSum = new int[N];
        prefixSum[0] = A[0];
        for (int i = 1; i < N; i++) {
            prefixSum[i] = prefixSum[i - 1] + A[i];
        }
        //Traversing through PrefixSumArray - TC : O(N)
        for (int i = 0; i < N; i++) {
            leftSum = (i == 0) ? 0 : prefixSum[i - 1];
            rightSum = prefixSum[N - 1] - prefixSum[i];
            if (leftSum == rightSum)
                ans++;
        }
        return ans;

    }
}
