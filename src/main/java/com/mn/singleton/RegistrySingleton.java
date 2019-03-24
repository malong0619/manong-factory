package com.mn.singleton;

import java.util.HashMap;
import java.util.Map;

public class RegistrySingleton {

    private static Map<String,Object> map = new HashMap();

    static {
        RegistrySingleton rs = new RegistrySingleton();
        map.put(rs.getClass().getSimpleName(),rs);
    }

    private RegistrySingleton() {}

    public static Object getInstance(String name) throws Exception {
        if (null == name) {
            name = RegistrySingleton.class.getSimpleName();
        }
        if(null == map.get(name)) {
            map.put(name, Class.forName(name).newInstance());
        }
        return map.get(name);
    }
}
