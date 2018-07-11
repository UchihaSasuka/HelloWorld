package com.idea.algorithm.others;

import java.util.Scanner;

/**
 * Created by lipengd@zbj.com on 2017/9/21.
 */
public class Main14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] array1 = new int[n];

        for(int i = 0 ; i < n ; i++){
            array1[i] = in.nextInt();
        }
        int m = in.nextInt();
        int[] array2 = new int[m];
        for(int i = 0 ; i < m ; i++){
            array2[i] = in.nextInt();
        }
        int[] array3 = new int[m + n];
        int pos1 = 0;
        int pos2 = 0;
        int sum = 0;
        for(int i = 0 ; i < m+n ; i++){
            if(pos1 >= n && pos2 < m){
                array3[i] = array2[pos2++];
                sum++;
            }else if(pos2 >= m && pos1 < n){
                array3[i] = array1[pos1++];
                sum++;
            }else if(pos1 < n && pos2 < m){
                if(array1[pos1] > array2[pos2]){
                    array3[i] = array2[pos2++];
                }else if(array1[pos1] == array2[pos2]){
                    array3[i] = array1[pos1++];
                    pos2++;
                }else{
                    array3[i] = array1[pos1++];
                }
                sum++;
            }

        }
        int middlePos = sum / 2 ;
        if(sum <= 1){
            System.out.println(array3[0]);
            return;
        }
        double middle = 0;
        if(sum % 2 == 0){
            middle = ((double) array3[middlePos - 1] + (double) array3[middlePos]) / 2;
            System.out.println(middle);
        }else {
            System.out.println(array3[middlePos]);
            return;
        }

    }
}
