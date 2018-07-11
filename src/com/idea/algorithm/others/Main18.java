package com.idea.algorithm.others;

import sun.reflect.generics.tree.Tree;

import java.util.Scanner;
import java.util.TreeMap;

/**
 * Created by lipengd@zbj.com on 2017/9/26.
 */
public class Main18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int[] scores = new int[num];
        int[] times = new int[num];
        double[] array = new double[num];
        int[] pos = new int[num];
        for(int i = 0 ; i< num; i++){
            scores[i] = in.nextInt();
        }
        for(int i = 0 ; i < num; i++){
            times[i] = in.nextInt();
        }
        int timeLimit = in.nextInt();

        for(int i = 0; i< num ; i++){
            pos[i] = i;
            array[i] = scores[i] / times[i];
        }
        for(int i = 0; i < num - 1 ; i++){
            for(int j = i; j < num ; j++){
                if(array[i] < array[j]){
                    double temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                    pos[i] = j;
                    pos[j] = i;
                }
            }
        }
        int sum = 0;
        int i = 0;
        while (timeLimit > 0 && i < num){
            if(timeLimit >= times[pos[i]]){
                int begin = i;
                if(i == num - 1){

                }else {
                    while(i < num  && (scores[i] == scores[i+1] || array[i] == 0 )){
                        if(array[i] == 0) {
                            i++;
                            continue;
                        }
                        if(scores[pos[i]] > scores[pos[i+1]]){
                            i++;
                        }else {
                            break;
                        }

                    }
                }

                array[i] = 0;
                i = begin;
                sum += scores[pos[i]];
                timeLimit -= times[pos[i]];
                i++;
            }else{
                i++;
            }
        }
        System.out.println(sum);

    }
}
