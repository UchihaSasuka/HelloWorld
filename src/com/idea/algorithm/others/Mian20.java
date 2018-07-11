package com.idea.algorithm.others;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by lipengd@zbj.com on 2017/9/26.
 */
public class Mian20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int[] A = new int[num];
        int[] B = new int[num];
        for(int i = 0 ; i< num; i++){
            A[i] = in.nextInt();
        }
        for(int i = 0 ; i < num; i++){
            B[i] = in.nextInt();
        }
        Arrays.sort(A);
        Arrays.sort(B);
        int pos1 = 0;
        int pos2 = 0;
        int n = 0;
        int same = 0;
        while(pos1 < num && pos2 < num){
            while(pos2 < num && B[pos1] >= A[pos2]){
                if(B[pos1] == A[pos2]){
                    same++;
                }
                pos2++;
            }
            if(pos2 < num){
                n++;
                pos1++;
                pos2++;
            }

        }
        System.out.println(n*100 - (num - n - same)*100);
    }
}
