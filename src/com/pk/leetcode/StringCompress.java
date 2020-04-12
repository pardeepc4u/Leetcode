package com.pk.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

class StringCompress {

    Map m = new TreeMap();

    public static void main(String[] args) {
        char[] input = {'a','a','b','b','b','c','c','c'};
        //Output Should be a2b3c3
        System.out.println(compress(input));
    }

    public static int compress(char[] chars) {
        if(chars.length==1)
            return 1;
        int count=1, len=1;
        for(int i=0; i< chars.length; i++){
            if(i+1<chars.length && chars[i] == chars[i+1]) {
                 count++;
            } else{
                // chars[i]=count;
                do{
                    len++;
                    count=count/10;
                    if(count>=10){
                        len++;
                    }
                }
                while(count>=10);
                  count=1;
            }
               
        }
        return len;
    }
}