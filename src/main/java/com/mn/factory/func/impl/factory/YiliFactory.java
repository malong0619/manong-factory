package com.mn.factory.func.impl.factory;

import com.mn.factory.func.FactoryFunction;
import com.mn.factory.func.Milk;
import com.mn.factory.func.impl.milk.Yili;

public class YiliFactory implements FactoryFunction {
    public Milk getMilk() {
        return new Yili();
    }
}
