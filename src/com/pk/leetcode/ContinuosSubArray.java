package com.pk.leetcode;

public class ContinuosSubArray {
    public static void main(String[] args) {
        int[] input = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(getContinuosSubArray(input));
    }

    public static int getContinuosSubArray(int [] arr){
        int sum=0 , maxSum=0;
        for(int i=0; i< arr.length; i++){
            if(sum<=0){
                sum=arr[i];
            }else{
                sum += arr[i];
            }
            if(sum > maxSum){
                maxSum=sum;
            }
        }
        return maxSum;
    }
}
