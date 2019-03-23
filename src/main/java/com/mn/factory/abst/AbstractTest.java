package com.mn.factory.abst;

import com.mn.factory.abst.impl.factory.MilkFactory;

public class AbstractTest {

    public static void main(String[] args) {
        System.out.println(new MilkFactory().getSanLun().getName());
    }
}
