package com.staticexamples;

import com.generics.StaticFieldInGenericClass;

/**
 * The static keyword in Java means that
 * the variable or function is shared between all instances of that class
 * as it belongs to the type, not the actual objects themselves.
 */
public class StaticExample {

    public String myNonStaticString= "I'm a non static String";
    public final static String myStaticString = "I'm a static String";


    public static void main(String[] args) {
        System.out.println(StaticExample.myStaticString);

        StaticExample se = new StaticExample();

        System.out.println(se.myNonStaticString);
        System.out.println(se.myStaticString);

       // StaticExample.myStaticString = "I'm a new static String"; // if final, this cannot be changed anymore
        System.out.println(StaticExample.myStaticString);

        //System.out.println(se.myNonStaticString);
    }
}
