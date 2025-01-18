package day7.q1;

import java.lang.*;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class AnnClient {
    public static void main(String[] args) {

        Class<?> clazz = Annotation.class;
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
        if (annotatedElement.isAnnotationPresent(day7.q1.Author.class)) {
            day7.q1.Author authorAnnotation = annotatedElement.getAnnotation(day7.q1.Author.class);
            System.out.println("Author: " + authorAnnotation.name());
        }
        if (annotatedElement.isAnnotationPresent(Version.class)) {
            Version versionAnnotation = annotatedElement.getAnnotation(Version.class);
            System.out.println("Version: " + versionAnnotation.number());
        }
    }
}
