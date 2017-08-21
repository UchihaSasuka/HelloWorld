package com.idea.algorithm.others;

/**
 * @author lipengd@zbj.com
 * @title
 * @date 2017/8/4.
 */
public class UpdateBits {
    public static void main(String[] args) {

        //System.out.println(Integer.toBinaryString(updateBits(1024,21,2,31)));
        binaryRepresentation("3.5");

    }
    public static int updateBits(int n, int m, int i, int j) {
        // write your code here
        int mask = j >= 31 ? ~((1 << j+1) - (1 << i)) : (1 << i) - 1 ;
        return m << i + (mask & n) ;
    }

    public static String binaryRepresentation(String n) {
        // write your code here
        float f = Float.parseFloat(n);
        System.out.println(Float.floatToIntBits(f));
        return "";
    }
}
