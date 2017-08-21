package com.idea.algorithm.others;

/**
 * @author lipengd@zbj.com
 * @title
 * @date 2017/8/4.
 */
public class Sqrt {
    public static void main(String[] args) {
        long num = sqrt(1);
        System.out.println(num*num);

    }

    public static int sqrt(int x) {
        // write your code here
        long start = 1;
        long end = x;
        while(start+1 < end){
            long mid = (start + end) / 2;
            long temp = mid*mid;
            if(temp == x){
                return (int)mid;
            }else if(temp < x){
                start = mid+1;
            }else {
                end = mid;
            }
        }
        if(end*end < x){
            return (int)end;
        }
        return (int)start;
    }
}
