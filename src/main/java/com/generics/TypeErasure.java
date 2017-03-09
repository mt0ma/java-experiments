package com.generics;

import java.util.ArrayList;

/**
 * Created by miruna on 2/6/2017.
 */
public class TypeErasure {

    public static void main(String[] args) {
        System.out.println("runtime type of ArrayList<String>: "+ new ArrayList<String>().getClass());
        System.out.println("runtime type of ArrayList<Long>  : "+ new ArrayList<Long>().getClass());


    }
}
