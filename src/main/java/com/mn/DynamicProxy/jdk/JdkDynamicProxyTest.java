package com.mn.DynamicProxy.jdk;

import com.mn.DynamicProxy.jdk.impl.JdkDynamicHandler;
import com.mn.DynamicProxy.jdk.impl.JdkProxyInterfaceImpl;

public class JdkDynamicProxyTest {

    public static void main(String[] args) {

        JdkDynamicHandler dh = new JdkDynamicHandler(new JdkProxyInterfaceImpl());

        JdkProxyInterface jdkProxyInterface = (JdkProxyInterface)dh.getInstance();

        System.out.println(jdkProxyInterface);

        jdkProxyInterface.writeJdkProxy();

    }
}
