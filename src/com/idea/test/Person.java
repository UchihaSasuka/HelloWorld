package com.idea.test;

/**
 * @author lipengd@zbj.com
 * @title
 * @date 2017/8/21.
 */
public class Person {
    protected int id;
    protected String name = "lp";

    public Person(){
        System.out.println("person "+ name);
    }
    public void sayHello(String name){
        System.out.println("parent say hello");
        InnerClass innerClass = new InnerClass();
        innerClass.setName("hello");
        System.out.println(innerClass.getName());
    }


    private static class InnerClass{
        private String name ;
        public void setName(String name){
            this.name = name;
        }
        public String getName(){
            return name;
        }
    }
}

