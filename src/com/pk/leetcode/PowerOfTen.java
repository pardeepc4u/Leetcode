package com.pk.leetcode;

import java.math.BigInteger;

public class PowerOfTen {

    public static boolean isPowerOfTen(BigInteger bigInteger){

        return false;
    }

    static final int[] POWERS_OF_10 = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};
    static int powerOfTen(int pow) {
        return POWERS_OF_10[pow];
    }

    public static void main(String[] args) {
        System.out.println(powerOfTen( (int) Math.pow( 2.0,2.0 ) ));
    }
}
