package com.pk.leetcode.tuts;

import java.util.ArrayList;
import java.util.List;

class PascalTriangle2Solution {
    public static List<Integer> getRow(int rowIndex) {
        
        List<Integer> result = new ArrayList<>();
        
        if(rowIndex>33 || rowIndex<0){
            return result;
        }
        if(rowIndex==0){
            result.add(1);
            return result;
        }
 
        for(int j=1;j<=rowIndex+1;j++){
            result.add(pascal(rowIndex+1,j));
        }

        return result;
    }
    
    // static int rows=32;
    // static int[][] dp =new int[rows][rows];
    
    public static int pascal(int i, int j){
         // if(dp[i-1][j-1]!=0){
         //    return dp[i-1][j-1];
         //  }
            if(j==1 || i==j) {
                // dp[i-1][j-1]=1;
                return 1;
            }
        return pascal(i-1,j-1)+pascal(i-1,j);
    }

    public static void main(String[] args) {
        System.out.println(getRow(33));
    }
}