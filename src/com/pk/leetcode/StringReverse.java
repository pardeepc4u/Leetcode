package com.pk.leetcode;

public class StringReverse {
    public static void main(String[] args) {
        char[] str1={'h','e','l','l','o'};
        char[] str2={'h','e','l','i','o','p'};
        reverseString(str1);
        System.out.println(str1);
        revStr(0,str2);

    }

    public static void reverseString(char[] s) {
        for(int i=0,j=s.length-1; i<j; i++,j--){
            char t=s[i];
            s[i]=s[j];
            s[j]=t;
        }
    }

    public static void revStr(int index, char[] str){
        if(str==null || index>=str.length) {
            return;
        }
        revStr(index+1,str);
        System.out.print(str[index]);
    }
}
