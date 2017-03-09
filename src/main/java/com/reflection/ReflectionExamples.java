package com.reflection;


import com.staticexamples.Persoana;

import java.lang.reflect.Method;

/**
 * Created by miruna on 2/15/2017.
 */
public class ReflectionExamples {


    public static void main(String[] args) {

        Class persoanaClass = Persoana.class;
        System.out.println("Persoana class methods");
        for(int j=0; j<persoanaClass.getMethods().length; j++) {
            System.out.println("" + persoanaClass.getMethods()[j].getName());
        }

        //Persoana p = new Persoana();
        //p.myPrivateMethod(123);

        try {
            Method privateMethod = persoanaClass.getDeclaredMethod("myPrivateMethod", null);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
