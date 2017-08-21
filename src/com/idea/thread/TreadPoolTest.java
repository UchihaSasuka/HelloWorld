package com.idea.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author lipengd@zbj.com
 * @title
 * @date 2017/8/4.
 */
public class TreadPoolTest {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        for(int i = 0 ; i < 10 ; i++){
            executorService.execute(new MyThread());
        }
        executorService.shutdown();
    }

}
