package com.pk.leetcode;

import java.util.Scanner;

public class PrintParantheseCombination {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        char[] str = new char[2*num];
        printParenthesis(str,num);
    }

    public static void printParenthesis(char[] str, int num){
        if(num>0){
            printParenthesisRecur(str, num, 0, 0, 0);
            return;
        }
    }

    public static void printParenthesisRecur(char[] str, int num, int pos, int open, int close){
        if(num==close){
                for(char s: str)
                    System.out.print(s);
            System.out.print("\n");
            return;
        }else{
            if(open>close){
                str[pos]='}';
                printParenthesisRecur(str, num, pos+1, open, close+1);
            }
            if(open<num){
                str[pos]='{';
                printParenthesisRecur(str, num, pos+1, open+1, close);
            }
        }
    }
}


//Referred from GeeksforGeeks