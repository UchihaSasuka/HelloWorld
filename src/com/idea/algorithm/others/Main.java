package com.idea.algorithm.others;

import java.util.Scanner;

/**
 * @author lipengd@zbj.com
 * @title
 * @date 2017/8/16.
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        int[][] array = new int[n][m];
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                String str = in.next();
                if(str.equals(".")){
                    array[i][j] = 0;
                }
                if(str.equals("#")){
                    array[i][j] = 1;
                }
                if(str.equals("@")){
                    array[i][j] = 2;
                }
                if(str.equals("*")){
                    array[i][j] = 3;
                }
                if(str.equals("X")){
                    array[i][j] = 4;
                }
            }
        }


    }
}
