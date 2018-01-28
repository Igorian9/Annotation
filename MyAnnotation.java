package ua.i.igor_igorovuich;


import java.lang.annotation.*;

@Target(value = ElementType.METHOD)
@Retention(value = RetentionPolicy.RUNTIME)
public @interface MyAnnotation {

    int a() default 0;

    int b() default 0;

}
