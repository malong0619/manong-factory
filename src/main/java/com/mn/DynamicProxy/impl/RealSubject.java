package com.mn.DynamicProxy.impl;

import com.mn.DynamicProxy.Subject;

public class RealSubject implements Subject {
    public void sayHello() {
        System.out.println("被代理类");
    }
}
