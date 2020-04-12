package com.pk.leetcode;

public class MaximumSubArray {

    public static void main(String[] args) {
        int[] input = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.print(getMaxSumofContinuosSubArray(input));
    }

    public static int getMaxSumofContinuosSubArray(int [] arr) {
        int sum = arr[0], maxSum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            sum = Math.max( arr[i], sum + arr[i] );
            maxSum = Math.max( sum, maxSum );
        }
        return maxSum;
    }
}
