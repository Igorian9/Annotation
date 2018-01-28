package ua.i.igor_igorovuich;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start");
        final Class<?> myClass = Something.class;
        Method[] methods = myClass.getDeclaredMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(MyAnnotation.class)) {
                try {
                    MyAnnotation ma = method.getAnnotation(MyAnnotation.class);
                    System.out.println(ma.a() + " " + ma.b());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

        }

    }
}

