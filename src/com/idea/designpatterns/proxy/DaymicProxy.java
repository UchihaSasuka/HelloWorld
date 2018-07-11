package com.idea.designpatterns.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by wiseacre on 2018/7/11.
 */
public class DaymicProxy implements InvocationHandler{

    private Subject subject;

    public DaymicProxy(Subject subject){
        this.subject = subject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before rent");

        System.out.println("Method" + method);

        method.invoke(subject, args);

        System.out.println("after rent");

        return null;
    }
}
