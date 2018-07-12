package com.idea.designpatterns.command;

public class RealCommond1 extends Commond {

    public RealCommond1(Receriver receriver){
        this.receriver = receriver;
    }
    @Override
    public void command() {
        System.out.println("this is command1");
        receriver.doSomething();
    }
}
