package com.idea.designpatterns.command;

public class RealCommond2 extends Commond {

    public RealCommond2(Receriver receriver){
        this.receriver = receriver;
    }
    @Override
    public void command() {
        System.out.println("this is command2");
        receriver.doSomething();
    }
}
