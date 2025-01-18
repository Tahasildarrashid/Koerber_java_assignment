package day7;

import java.lang.*;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class AnnClient {
    public static void main(String[] args) {

        Class<?> clazz = day7.Annotation.class;
        getAnnotations(clazz);

        Class<?> nestedClazz = clazz.getDeclaredClasses()[0];
        getAnnotations(nestedClazz);

        Method[] methods = nestedClazz.getDeclaredMethods();
        for (Method method : methods) {
            getAnnotations(method);
        }

        Constructor<?>[] constructors = clazz.getConstructors();
        for (Constructor<?> constructor : constructors) {
            getAnnotations(constructor);
        }
    }

    public static void getAnnotations(AnnotatedElement annotatedElement) {
        if (annotatedElement.isAnnotationPresent(day7.Author.class)) {
            day7.Author authorAnnotation = annotatedElement.getAnnotation(day7.Author.class);
            System.out.println("Author: " + authorAnnotation.name());
        }
        if (annotatedElement.isAnnotationPresent(day7.Version.class)) {
            day7.Version versionAnnotation = annotatedElement.getAnnotation(day7.Version.class);
            System.out.println("Version: " + versionAnnotation.number());
        }
    }
}
