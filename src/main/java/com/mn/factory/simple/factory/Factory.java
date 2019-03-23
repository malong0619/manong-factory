package com.mn.factory.simple.factory;

import com.mn.factory.simple.Milk;
import com.mn.factory.simple.impl.MengNiu;
import com.mn.factory.simple.impl.Telunsu;

public class Factory {

    public Milk getMilk(String name) {

        if("mentniu".equals(name)) {
            return new MengNiu();
        } else if("telunsu".equals(name)) {
            return new Telunsu();
        }
        return null;
    }
}
