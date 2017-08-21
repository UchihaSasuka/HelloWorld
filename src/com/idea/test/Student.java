package com.idea.test;

/**
 * @author lipengd@zbj.com
 * @title
 * @date 2017/8/21.
 */
public class Student extends Person{

    public void sayHello(String name){
        System.out.println("child say hello");
    }

    public static void main(String[] args) {
        Person p = new Student();
        p.sayHello("");
        EnumTest.RED.getIndex();
        EnumTest.RED.sayHello("LP","1");
        EnumTest.RED.sayHello2();
    }
}
