package com.idea.algorithm.others;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by lipengd@zbj.com on 2017/9/20.
 */
public class Main11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        long result = 1;
        int k = a % m;

        for(int i = 0; i < b ; i++){
            result *= a;
        }
        System.out.println(result % m);
    }
}
