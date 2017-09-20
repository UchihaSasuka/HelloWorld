package com.idea.algorithm.others;

import java.util.Scanner;

/**
 * Created by lipengd@zbj.com on 2017/9/15.
 */
public class Main6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int array[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            array[i] = in.nextInt();
        }
        for(int i = 0 ; i < n ; i++){
            int sum = count(array[i]);
            System.out.println(sum);
        }
    }

    public static int count(int n){
        if(n == 1){
            return  1;
        }
        if(n == 2){
            return 1;
        }
        int i = 3;
        int an = 1;
        int a1 = 1;
        int a2 = 2;
        while(i <= n){
            an = (2 * a2 + a1) % 32767;
            a1 = a2;
            a2 = an;
            i++;
        }
        return an;
    }
}
