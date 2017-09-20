package com.idea.algorithm.others;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by lipengd@zbj.com on 2017/9/20.
 */
public class Main10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String sequnce = in.nextLine();
        int k = in.nextInt();
        String[] array = sequnce.split(" ");
        Arrays.sort(array);
        for(int i = 0 ; i < k ; i++){
            if(i == k-1){
                System.out.print(array[i] + "\n");
            }else{
                System.out.print(array[i] + " ");
            }
        }

        for(int i = array.length - 1 ; i >= array.length - k  ; i--){
            System.out.print(array[i] + " ");
        }
    }
}
