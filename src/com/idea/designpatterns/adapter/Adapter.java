package com.idea.designpatterns.adapter;

public class Adapter extends Ps2Impl implements Usb{
    @Override
    public void print() {
        System.out.println("这里是适配器");
        super.print2();
    }
}
