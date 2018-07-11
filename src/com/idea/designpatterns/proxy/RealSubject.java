package com.idea.designpatterns.proxy;

/**
 * Created by wiseacre on 2018/7/11.
 */
public class RealSubject implements Subject{
    @Override
    public void rent() {
        System.out.println("I want to rent the house");
    }

    @Override
    public void hello(String str) {
        System.out.println("hello, " + str);
    }
}
