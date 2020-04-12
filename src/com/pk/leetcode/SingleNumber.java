package com.pk.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SingleNumber {

//    XOR of a number with itself is 0.
//    XOR of a number with 0 is number itself.
    public static int singleNumber(int[] nums) {
        int res = 0;
        for(int i=0; i<nums.length;i++){
            res = res ^ nums[i];
        }
        return res;
    }

    public static void main(String[] args) {
//        int nums[] = {4,1,2,1,2};
        int nums[] = {1,2,1};
        System.out.println(singleNumber( nums ));

    }
}
