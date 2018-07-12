package com.idea.designpatterns.command;

public class Client {
    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        Commond commond1 = new RealCommond1(new RealReceiver1());
        Commond commond2 = new RealCommond2(new RealReceiver2());
        invoker.setCommond(commond1);
        invoker.action();
        invoker.setCommond(commond2);
        invoker.action();
    }
}
