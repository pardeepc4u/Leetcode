package com.pk.leetcode;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

    public static boolean isHappy(int n) {
        if(n<=0){
            return false;
        }
        Set<Integer> dup = new HashSet<>(  );
        while(true) {
            if(!dup.add( n ))
                return false;
            n=isHappyNumber(n);
            System.out.println("New Num : " + n);
            if(n == 1)
                return true;
        }
    }

    public static int isHappyNumber(int num) {
        int sum=0;
        int i=0;
        while(num>0) {
            i=num%10;
            sum+=i*i;
            num/=10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(isHappy( 2 ));
    }
}
