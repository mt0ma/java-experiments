package com.annotations.examples.customJUnit;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Victor Vlad Corcodel on 06/04/2017.
 */
public class HandleTest {

    public static void main(String[] args) {
        MyTest myTest = new MyTest();

        List<Method> lista = Arrays.asList(MyTest.class.getDeclaredMethods());

//        lista.forEach(m -> {
//            try {
//                m.invoke(myTest);
//            } catch (Exception e) {
//                System.out.println(e.getMessage());
//            }
//        });

        lista.stream().filter(m -> {
            List<Annotation> declaredAnnotations = Arrays.asList(m.getDeclaredAnnotations());
            return declaredAnnotations.stream().filter(a -> a instanceof TestMe).collect(Collectors.toList()).size()==1;
        }).forEach(m -> {
            try {
            m.invoke(myTest);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    });

    }
}
