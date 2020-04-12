package com.pk.leetcode;

import java.util.Arrays;

public class MoveZero {
    public static void moveZeroes(int[] nums) {
        int[] dup = new int[nums.length];
        int j =0;
        //[0,1,0,3,12]
        for(int i : nums){
            if(i!=0){
                dup[j]=i;
                j++;
            } else{
                dup[nums.length-j-1] = 0;
            }

        }
        for(int i=0; i<dup.length; i++){
            nums[i]=dup[i];
        }
    }

    public static void moveZeros_v1(int[] nums){
        int j = 0;
        for(int i : nums){
            if(i!=0)
                nums[j++]=i;
        }
        while(j<nums.length){
            nums[j++]=0;
        }
    }

    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
//        moveZeroes(arr);
        moveZeros_v1( arr );
        for(int j : arr)
            System.out.println(j);
    }
}
