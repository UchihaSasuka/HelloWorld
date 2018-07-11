package com.idea.algorithm.others;
import java.util.Scanner;

/**
 * Created by lipengd@zbj.com on 2017/9/23.
 */
public class Main16 {

        /*请完成下面这个函数，实现题目要求的功能
        当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^
        ******************************开始写代码******************************/
        static long solve(int[] num, int m) {
            long max = 0;
            for(int i = 0 ; i < m ; i++){
                max += num[i];
            }
            long temp = max;
            int pos = 0;
            for(int i = m ; i < num.length ; i++){
                temp = temp - num[pos] + num[i];
                if(temp > max){
                    max = temp;
                }
                pos++;
            }
            return max;

        }
        /******************************结束写代码******************************/


        public static void main(String[] args){
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int[] array = new int[n];
            for(int i = 0 ; i < n ; i++){
                array[i] = in.nextInt();
            }
            int m = in.nextInt();
            System.out.println(solve(array, m));

        }

}
