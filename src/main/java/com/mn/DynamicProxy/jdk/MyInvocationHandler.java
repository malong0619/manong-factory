package com.mn.DynamicProxy.jdk;

import java.lang.reflect.Method;

public interface MyInvocationHandler {

    public Object invoke(Object proxy, Method method, Object[] args);
}
