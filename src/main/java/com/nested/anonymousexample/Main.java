package com.nested.anonymousexample;

/**
 * Created by miruna on 3/7/2017.
 */
public class Main {

    public static void main(String[] args) {
        // this is an anonymous class
        AbstractBehaviour absB = new AbstractBehaviour() {
            @Override
            public String implementMe() {
                return "Print something";
            }
        };

        System.out.println(absB.implementMe());



    }
}
