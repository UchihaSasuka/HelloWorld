package com.idea.algorithm.others;

import java.util.Scanner;

/**
 * Created by lipengd@zbj.com on 2017/9/10.
 */
public class Main5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n = in.next();
        String m = n;
        while(true){
            String str = m;
            long x = 0;
            for(int i = 0 ; i < str.length() ; i++){
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str.charAt(i));
                x += Integer.parseInt(stringBuilder.toString());
            }
            String result = sub(m, x+"");
            if(result.length() < n.length() || result.compareTo(n) <0){
                m = add(m);
            }else{
                System.out.println(m);
            }

        }
    }
    public static String sub(String s1 , String s2){
        StringBuilder sb1 = new StringBuilder(s1);
        StringBuilder sb2 = new StringBuilder(s2);
        s1 = sb1.reverse().toString();
        s2 = sb2.reverse().toString();
        int flag = 0;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s2.length() ; i++){
            StringBuilder stringBuilder = new StringBuilder();
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder.append(s1.charAt(i));
            stringBuilder2.append(s2.charAt(i));
            int x = Integer.parseInt(stringBuilder.toString());
            int y = Integer.parseInt(stringBuilder2.toString());
            int temp = 0;
            if((x-temp) < y){
               temp = x + 10 - flag -y;
               flag = 1;
            }else{
               temp = x - y - flag;
               flag = 0;
            }
            sb.append(temp);
            }

            return sb.reverse().toString();
        }


    public static String add(String s){

        int len = s.length() -1;
        boolean flag = false;
        StringBuilder sb = new StringBuilder(s);
        while(len >= 0){
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(s.charAt(len));
            int n = Integer.parseInt(stringBuilder.toString());
            n = n +1;
            if(n > 9){
               // sb.replace(len,len+1,"0");
                sb = new StringBuilder(sb.substring(len-1,len));
                sb.insert(len,"0");
                flag = true;
            } else {
                sb = new StringBuilder(sb.substring(len-1,len));
                sb.insert(len,n+"");
                flag = false;
                break;
            }
            len--;
        }
        if(flag){
            sb.insert(0,"1");
        }
        return sb.toString();

    }
}
