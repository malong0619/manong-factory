package com.mn.factory.func;

import com.mn.factory.func.impl.factory.MengNiuFactory;

public class FuncTest {

    public static void main(String[] args) {

        System.out.println(new MengNiuFactory().getMilk().getName());
    }
}
