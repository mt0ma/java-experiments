package com.generics;

/**
 * Created by miruna on 2/6/2017.
 */
public class GenericMethodsOverloading {


    static void printMe(String object) {
        System.out.println("printMe(String)");
    }

    static void printMe(Integer object) {
        System.out.println("printMe(Integer)");
    }

    static void printMe(Object object) {
        System.out.println("printMe(Object)");
    }

    static <T> void genericMethod(T argument) {
        printMe(argument);
    }

    public static void main(String[] args) {
        genericMethod(new String("test"));
        //Because there is only one byte code representation of each generic type or method.
    }
}
