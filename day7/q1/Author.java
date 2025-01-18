package day7.q1;

import java.lang.annotation.*;

@Target(value={ElementType.CONSTRUCTOR, ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@interface Author{
    String name() default "Unknown";
}
