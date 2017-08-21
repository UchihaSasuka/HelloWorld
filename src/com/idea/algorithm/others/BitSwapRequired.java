package com.idea.algorithm.others;

/**
 * @author lipengd@zbj.com
 * @title
 * @date 2017/8/4.
 */
public class BitSwapRequired {
    public static void main(String[] args) {
        bitSwapRequired(-2147483648,11);
    }

    public static int bitSwapRequired(int a, int b) {
        // write your code here

        int c = a ^ b;
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(b));
        System.out.println(Integer.toBinaryString(c));
        int flag = c < 0 ? -1 : 1;
        int count = 0 ;
        for(int i = 0 ; i < 32 ; i++){
            if((flag & c) == flag){
                count++;
            }
            flag = flag << 1;
        }

        return count;
    }
}
