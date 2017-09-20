package com.idea.algorithm.others;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by lipengd@zbj.com on 2017/9/9.
 */
public class Main4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int max = 0;
        if(a == c && a == 1){
            System.out.println(a + b + c);
            return;
        }
        if(a == 1){
            max = (a + b) * c;
            System.out.println(max);
            return;
        }
        if(b == 1){
            max = (Math.min(a, c) + b) * c;
            System.out.println(max);
            return;
        }
        if(c == 1){
            max = a * (b + c);
            System.out.println(max);
            return;
        }
        System.out.println(a * b * c);


    }
}
