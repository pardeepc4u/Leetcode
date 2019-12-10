package com.pk.leetcode;

public class MaxSumOfContinuosSubArray {

    public static void main(String[] args) {
        int[] input = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.print(getMaxSumofContinuosSubArray(input));
    }

    public static int getMaxSumofContinuosSubArray(int [] arr){
        int sum = 0, newSum=0;
        for(int i=0; i< arr.length; i++){
            if(i==0) sum=arr[i];
            for(int j=i+1; j< arr.length; j++){
                newSum = arr[i]+arr[j];
                if(sum < newSum){
                    sum=newSum;
                }
            }
        }
        return sum;
    }
}
