package com.idea.algorithm.others;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by lipengd@zbj.com on 2017/9/15.
 */
public class Main7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while(in.hasNext()){
            int n = in.nextInt();
            HashMap<String, Integer> map = new HashMap<>();
            for(int i = 0 ; i < n ; i++){
                String name = in.next();
                if(map.get(name) == null){
                    System.out.println("OK");
                    map.put(name, 1);
                }else{
                    int count = map.get(name);
                    System.out.println(name+count);
                    map.put(name, count+1);
                }

            }
        }
    }
}
