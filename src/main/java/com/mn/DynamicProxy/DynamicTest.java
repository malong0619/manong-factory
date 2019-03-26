package com.mn.DynamicProxy;

import com.mn.DynamicProxy.impl.RealSubject;

public class DynamicTest {

    public static void main(String[] args) {

        Subject realSubject = new RealSubject();

        DynamicProxy dp = new DynamicProxy(realSubject);

        Subject subject = dp.getInstance();

        subject.sayHello();


    }
}
