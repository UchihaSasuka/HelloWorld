package com.idea.algorithm.others;

import java.util.Scanner;

/**
 * Created by lipengd@zbj.com on 2017/9/8.
 */
public class Main2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        StringBuilder sb = new StringBuilder();
        int start = 0;
        for(int i = 0 ; i < str.length() ; i++){
            char c = str.charAt(i);
            if(c >= 'a' && c <= 'z'){
                sb.append(String.valueOf(c), start++, start);
            }else if(c >= 'A' && c <= 'Z'){
                sb.append(c);
            }
        }
        System.out.println(sb.toString());
    }
}
