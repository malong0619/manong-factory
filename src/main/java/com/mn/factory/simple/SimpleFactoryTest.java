package com.mn.factory.simple;

import com.mn.factory.simple.factory.Factory;

public class SimpleFactoryTest {

    public static void main(String[] args){

        System.out.println(new Factory().getMilk("mengniu").getName());
    }
}
