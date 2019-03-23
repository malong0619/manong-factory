package com.mn.factory.abst.impl.factory;

import com.mn.factory.abst.AbstractFactory;
import com.mn.factory.abst.Milk;
import com.mn.factory.abst.impl.milk.Sanlu;
import com.mn.factory.abst.impl.milk.Sanyuan;

public class MilkFactory extends AbstractFactory {
    public Milk getSanYuan() {
        return new Sanyuan();
    }

    public Milk getSanLun() {
        return new Sanlu();
    }
}