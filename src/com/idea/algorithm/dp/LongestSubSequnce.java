package com.idea.algorithm.dp;

/**
 * @author lipengd@zbj.com
 * @title
 * @date 2017/8/18.
 */
public class LongestSubSequnce {
    public static void main(String[] args) {
        int len = longestSubSequnce(new int[]{1,2,3,4,7,2,3,5,9});
    }

    public static int longestSubSequnce(int[] A){
        int[] B = new int[A.length];
        int len = 1;
        for(int i = 0 ; i < A.length ; i++){
            B[i] = 1;

            for(int j = 0 ; j < i ; j++){
                if(A[i] > A[j]){
                    B[i] = Math.max(B[i], B[j]+1);
                }
            }
            len = Math.max(len, B[i]);
        }
        return len;
    }
}
