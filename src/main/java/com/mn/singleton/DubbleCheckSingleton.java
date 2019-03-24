package com.mn.singleton;

public class DubbleCheckSingleton {

    private static volatile DubbleCheckSingleton dcs;

    private DubbleCheckSingleton() {}

    public static DubbleCheckSingleton getInstance() {
        if (null ==dcs) {
            synchronized (DubbleCheckSingleton.class) {
                if (null == dcs) {
                    dcs = new DubbleCheckSingleton();
                }
            }
        }
        return dcs;
    }
}
