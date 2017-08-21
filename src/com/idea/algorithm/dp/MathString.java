package com.idea.algorithm.dp;

/**
 * @author lipengd@zbj.com
 * @title
 * @date 2017/8/18.
 */
public class MathString {
    public static void main(String[] args) {
        isMatch("aa", "a");
    }

    //TODO 未完成
    public static boolean isMatch(String s, String p) {
        // write your code here
        int n = s.length() + 1;
        int m = p.length() + 1;
        int[][] array = new int[n][m];

        for(int i = 1 ; i < n+1 ; i++){
            array[0][i] = i;
        }

        for(int i =1 ; i < m+1 ; i++){
            array[i][0] = i;
        }
        return false;



    }
}
