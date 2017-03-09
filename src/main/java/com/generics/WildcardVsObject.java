package com.generics;

import java.util.Collection;
import java.util.List;
import java.util.ArrayList;

/**
 * Created by miruna on 2/6/2017.
 */
public class WildcardVsObject {

    public static void main(String[] args) {
        String stringObj = "I'm a String object";
        Integer integerObj = 0;
        Number numberObj = 1.2;

        List<Object> objectList = new ArrayList<>();
        objectList.add(stringObj);
        objectList.add(integerObj);
        objectList.add(numberObj);


        List<String> genericWList = new ArrayList<>();
        genericWList.add(stringObj);
    }


}
