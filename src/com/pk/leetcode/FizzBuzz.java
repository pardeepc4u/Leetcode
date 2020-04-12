package com.pk.leetcode;

import java.util.*;

class FizzBuzz {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        int tot_test = s.nextInt();
        int numbs[] = new int[tot_test];


        for(int i=0;i<tot_test;i++){
            numbs[i]=s.nextInt();
        }

        for(int k=0;k<numbs.length;k++){
            for(int j=1;j<=numbs[k];j++){
                if(j%3==0 && j%5==00){
                    System.out.println("FizzBuzz");
                }else if(j%3==0){
                    System.out.println("Fizz");
                }else if(j%5==0){
                    System.out.println("Buzz");
                }else{
                    System.out.println(j);
                }
            }
        }
    }
}
