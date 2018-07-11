package com.idea.algorithm.others;

import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by lipengd@zbj.com on 2017/9/21.
 */
public class Main15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        Set<Character> set = new HashSet<>();
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0 ; i < s.length() ; i++){
            if(!set.contains(s.charAt(i))){
                stringBuilder.append(s.charAt(i));
                set.add(s.charAt(i));
            }
        }
        System.out.println(stringBuilder.toString());

    }
}
