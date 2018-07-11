package com.idea.algorithm.others;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by lipengd@zbj.com on 2017/9/23.
 */
public class Main17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] array = new int[m];
        int pos = 0;
        int max = Integer.MAX_VALUE;
        int min = 0;
        int sum = 0;
        int pos2 = 0;
        for(int i = 0 ; i < m ; i++){
            array[i] = in.nextInt();
            sum += array[i];
        }
        Arrays.sort(array);
        for(int i = 1 ; i <= n ; i++){
            if(pos < array.length && i == array[pos] ){
                min += array[pos];
                pos++;
            }else{
                int temp = 0 ;
                if(i < array[array.length - 1]){
                    int a = (array.length - pos)* i;
                    int b =  pos*i;
                    temp = sum - a + b - min;
                }else{
                    temp = i*array.length - sum;
                }
                if(temp < max){
                   pos2 = i;
                   max = temp;
                }
            }
        }
        System.out.println(pos2);
    }
}
