package com.idea.aop;

import java.util.Date;

/**
 * Created by zjl on 2017/7/13.
 */
public class AopTestImpl1 implements  AopTest{


    @Override
    public void method1() {
        System.out.println("impl1 method1");
    }

    @Override
    public void method2() {
        System.out.println("impl2 method2");
    }
}
