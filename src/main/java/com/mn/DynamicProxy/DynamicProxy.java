package com.mn.DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxy implements InvocationHandler {

    private Subject subject;

    public DynamicProxy(Subject subject) {
        this.subject = subject;
    }

    public Subject getInstance() {
        return (Subject)Proxy.newProxyInstance(subject.getClass().getClassLoader(), subject.getClass().getInterfaces(), this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("被代理方法之前的增强");
        System.out.println("method : " + method.getName());

        method.invoke(subject, args);

        System.out.println("被代理方法之后的增强");

        return null;
    }
}
