package com.pk.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalTriangle {

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>(new ArrayList<>());
//        rows=numRows;
        for(int i=1;i<=numRows;i++){
            List<Integer> colSum = new ArrayList<>();
            for(int j=1;j<=i;j++){
               colSum.add(pascal( i,j));
            }
            result.add( colSum );
        }
        return result;
    }
    static  int rows=50;
    static int[][] dp =new int[rows][rows];

    public static int pascal(int i, int j){
        if(dp[i-1][j-1]!=0){
            return dp[i-1][j-1];
        }
            if(j==1 || i==j) {
                dp[i-1][j-1]=1;
                return 1;
            }
        return dp[i-1][j-1]=pascal(i-1,j-1)+pascal(i-1,j);
    }

    public static void main(String[] args) {
//        System.out.println(pascal( 5,5 ));
        System.out.println(generate( 5 ));

    }
}
