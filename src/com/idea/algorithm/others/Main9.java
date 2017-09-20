package com.idea.algorithm.others;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by lipengd@zbj.com on 2017/9/18.
 */
public class Main9 {
    public static void main(String[] args) {
       /* Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        String s2 = in.nextLine();
        String[] v = s1.split(" ");
        String[] w = s2.split(" ");
        Map<String, Integer> map = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        int max = 0;
        for(int i = 0 ; i < v.length ; i++){
            int n = Integer.parseInt(w[i]);
            int count = 1;
            if(map.get(v[i]) != null){
                int m = map.get(v[i]);
                count = map2.get(v[i]) + 1;
                n = m+n;
            }
            map.put(v[i], n);
            map2.put(v[i], count);
            if(n > max){
                max = n;
            }
        }
        int maxCount = 1;
        String id = "";
        for(String s : map.keySet()){
            int n = map.get(s);
            if(n == max){
                int count = map2.get(s);
                if(count >= maxCount){
                    id = s;
                    maxCount = count;
                }
            }
        }
        System.out.println(id);*/
       test();
    }

    public static void test(){
        String a = "abc";
        String b = "a";
        String c = "ab";
        String d ="a"+"bc";
        String e = a + c;
        System.out.println(a == d);
        System.out.println(a == e);
    }
}
