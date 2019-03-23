package com.mn.factory.func.impl.factory;

import com.mn.factory.func.FactoryFunction;
import com.mn.factory.func.Milk;
import com.mn.factory.func.impl.milk.MengNiu;

public class MengNiuFactory implements FactoryFunction {
    public Milk getMilk() {
        return new MengNiu();
    }
}
