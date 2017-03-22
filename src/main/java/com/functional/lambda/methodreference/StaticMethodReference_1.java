package com.functional.lambda.methodreference;

import java.util.Arrays;
import java.util.List;

/**
 *  (args) -> Class.staticMethod(args)
 */
public class StaticMethodReference_1 {

    public static void main(String[] args) {

        // static methods
        List<String> stringList = Arrays.asList("test", "method", "references");
        stringList.forEach(string -> System.out.println(string));
        // can be translated to
        stringList.forEach(System.out::println);
    }

}
