package com.idea.designpatterns.adapter;

public class AdapterDemo {
    public static void main(String[] args) {
        Usb usb = new Adapter();
        usb.print();
    }
}
