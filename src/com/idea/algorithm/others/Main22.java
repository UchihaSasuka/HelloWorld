package com.idea.algorithm.others;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lipengd@zbj.com on 2017/10/14.
 */
public class Main22 {
    public char getMaxCountChar(String s){
        char[] array = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        int max = 0;
        char target = ' ';
        for(char c : array){
            Integer count = map.get(c);
            if(count == null){
                count = 1;
            }else {
                count++;
            }
            map.put(c, 1);
            if(count > max){
                max = count;
                target = c;
            }
        }
        return target;
    }
}
