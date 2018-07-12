package com.idea.designpatterns.command;

public class RealReceiver2 implements Receriver{
    @Override
    public void doSomething() {
        System.out.println("clean");
    }
}
