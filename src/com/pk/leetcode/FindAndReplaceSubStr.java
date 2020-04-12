package com.pk.leetcode;

class FindAndReplaceSubStr {

    public static String findReplaceString(String S, int[] indexes, String[] sources, String[] targets) {
        
        String result=null;
        StringBuilder str = new StringBuilder(S);
        
        for(int i=0; i<indexes.length; i++){

           if(S.substring(indexes[i],indexes[i]+sources[i].length()).equalsIgnoreCase(sources[i])){
//               result=S.replace(S.substring(indexes[i],sources[i].length()),targets[i]);
               str=str.replace(indexes[i],sources[i].length(),targets[i]);
               S.replace("","");
           }
            
        }
        return str.toString();
//        return result;
    }

    String replaceStr(String source, String replaceStr){
        return "";
    }


    public static void main(String[] args) {
        String S="abcd";
        int[] indexes={0,2};
        String[] sources={"ab","cd"};
        String[] targets={"eee","fff"};

        System.out.println(findReplaceString(S,indexes,sources,targets));
    }
}