package com.pk.leetcode;

import java.util.HashSet;

public class DistinctSubString {

    public static void main(String[] args) {
        String input = "abcbcdeae";
        System.out.print(getDistinctSubString(input));
    }

    public static String getDistinctSubString(String in){
        int i=0,j=0,max=0;
        String subMaxStr=null;
        HashSet charSet = new HashSet();
        while(j<in.length()){
            if(!charSet.contains(in.charAt(j))){
                charSet.add(in.charAt(j));
                subMaxStr+=in.charAt(j);
                max++;
            }
            else {
                charSet.remove(in.charAt(i));
            }
        }
        return subMaxStr;
    }
}
