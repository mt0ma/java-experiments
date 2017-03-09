package com.nested.anonymousexample;

/**
 * Created by miruna on 3/7/2017.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println(new AbstractBehaviour() {
            @Override
            public String implementMe() {
                return "Print something";
            }
        }.implementMe());



    }
}
