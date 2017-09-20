package com.idea.algorithm.others;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by lipengd@zbj.com on 2017/9/8.
 */
public class Main3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String  str = in.next();
        Stack<Character> stack = new Stack<>();
        int count = 1;
        for(int i = 0 ; i < str.length() ; i++){
            char c = str.charAt(i);
            if(c == '('){
                stack.push(c);
            }else if(c == ')'){
                count *= stack.size();
                stack.pop();
            }
        }
        System.out.println(count);
    }
}
