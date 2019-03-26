package com.mn.DynamicProxy.jdk.impl;

import com.mn.DynamicProxy.jdk.JdkProxy;
import com.mn.DynamicProxy.jdk.JdkProxyInterface;
import com.mn.DynamicProxy.jdk.MyClassLoader;
import com.mn.DynamicProxy.jdk.MyInvocationHandler;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class JdkDynamicHandler implements MyInvocationHandler {

    private JdkProxyInterface jdkProxyInterface;

    public JdkDynamicHandler(JdkProxyInterface jdkProxyInterface) {
        this.jdkProxyInterface = jdkProxyInterface;
    }

    public Object getInstance() {
        System.out.println("代理方法开始");
        Object obj = JdkProxy.newProxyInstance(new MyClassLoader(), jdkProxyInterface.getClass().getInterfaces(),this);

        return obj;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) {

        try {
            method.invoke(jdkProxyInterface, args);
            System.out.println("代理方法结束");
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }
}
