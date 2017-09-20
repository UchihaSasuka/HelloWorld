package com.idea.algorithm.others;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by lipengd@zbj.com on 2017/9/18.
 */
public class Main8 {
    public static int count;
    public static Scanner in = new Scanner(System.in);
    public static Queue<String> queue= new LinkedList<>();
    public static Lock lock = new ReentrantLock();
    public static void main(String[] args) {
        int len = 10;
        int i = 0;
        while(i < len){
            queue.add(in.nextLine());
            i++;
        }
       /* Runnable runnable = new Runnable() {
            @Override
            public void run() {
                while(!queue.isEmpty()){
                    synchronized (this){
                    String s = queue.poll();
                    if (s.contains("u51")){
                        Main8.count++;
                        }
                    }

                }
            }
        };
*/
        Runnable runnable = new MyRunnable();
        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);
        Thread t3 = new Thread(runnable);
        t1.start();
        t2.start();
        t3.start();
        while(!queue.isEmpty()){
           String s = queue.poll();
           if(s.contains("u51")){
               count++;
           }
        }
        System.out.println(count);

    }

    static class MyRunnable implements Runnable{
        public void run() {
            while(!queue.isEmpty()){
                synchronized (queue){
                    String s = queue.poll();
                    if (s.contains("u51")){
                        Main8.count++;
                    }
                }

            }
        }
    }
}
