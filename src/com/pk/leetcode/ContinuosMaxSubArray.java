package com.pk.leetcode;

public class ContinuosMaxSubArray {
    public static void main(String[] args) {
        int[] input = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.print("Max count of sub array : ");
        System.out.println(getContinuosMaxSubArray(input));
    }

    public static int getContinuosMaxSubArray(int [] arr){
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
