package com.idea.designpatterns.command;

public class RealReceiver1 implements Receriver{
    @Override
    public void doSomething() {
        System.out.println("cook");
    }
}
