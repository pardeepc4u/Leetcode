package com.pk.leetcode;

public class IsPrime {

    public static boolean isPrimeVer_1(int num){
        if(num <=1){
            return false;
        }
        int count=0;
        for(int i=2;i<num;i++) {
                if (num % i == 0) {
                    count++;
                }
        }
        if(count<1) return true;
        else return false;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,11,13,17};
        for(int x:arr){
            System.out.println("Number " +x+ " Is prime : " + isPrimeVer_1( x ));
        }

    }
}
