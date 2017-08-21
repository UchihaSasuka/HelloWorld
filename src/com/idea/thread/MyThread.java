package com.idea.thread;

/**
 * @author lipengd@zbj.com
 * @title
 * @date 2017/8/4.
 */
public class MyThread implements Runnable{
    @Override
    public void run() {
        System.out.println("hello");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
