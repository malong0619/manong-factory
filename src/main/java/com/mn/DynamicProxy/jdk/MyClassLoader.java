package com.mn.DynamicProxy.jdk;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;

public class MyClassLoader extends ClassLoader {

    private File classFilePath;

    public MyClassLoader() {
        String filePath = MyClassLoader.class.getResource("").getPath();
        classFilePath = new File(filePath);
    }

    @Override
    protected Class<?> findClass(String name) {
        String className = MyClassLoader.class.getPackage().getName() + "." + name;
        if (null != classFilePath) {
            File classFile = new File(classFilePath, name + ".class");
            if (classFile.exists()) {
                FileInputStream in = null;
                ByteArrayOutputStream out = null;
                try {
                    in = new FileInputStream(classFile);
                    out = new ByteArrayOutputStream();
                    byte[] bytes = new byte[1024];
                    int len;
                    while((len = in.read(bytes)) != -1) {
                        out.write(bytes, 0, len);
                    }

                    return defineClass(className, out.toByteArray(), 0, out.size());
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    try {
                        if (null != in) {
                            in.close();
                        }
                        if (null != out) {
                            out.close();
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        return null;
    }
}
