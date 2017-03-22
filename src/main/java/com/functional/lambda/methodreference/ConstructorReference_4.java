package com.functional.lambda.methodreference;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

/**
 * Constructor method reference
 *      (args) -> new ClassName(args) can be written as ClassName::new
 */
public class ConstructorReference_4 {

    public static void main(String[] args) {
        // Using an anonymous class
        Supplier<List<String>> s = new Supplier() {
            public List<String> get() {
                return new ArrayList<String>();
            }
        };
        List<String> l = s.get();

        // Using a lambda expression
        Supplier<List<String>> s1 = () -> new ArrayList<String>();
        List<String> l1 = s1.get();

        // Using a method reference
        Supplier<List<String>> s2 = ArrayList::new;
        List<String> l2 = s2.get();
    }
}
