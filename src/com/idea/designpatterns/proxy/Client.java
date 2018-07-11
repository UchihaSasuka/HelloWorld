package com.idea.designpatterns.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by wiseacre on 2018/7/11.
 */
public class Client {
    public static void main(String[] args) {
        Subject subject = new RealSubject();
        InvocationHandler handler = new DaymicProxy(subject);

        Subject subject1 = (Subject) Proxy.newProxyInstance(handler.getClass().getClassLoader(),
                subject.getClass().getInterfaces(), handler);
        System.out.println(subject1.getClass().getName());
        subject1.rent();
        subject1.hello("world");

    }
}
