package com.functional.exercises;

/**
 * Created by Victor Vlad Corcodel on 30/03/2017.
 */
public class StringUtils {

    static String betterString(String s1, String s2, TwoStringPredicate predicate) {
        return predicate.evaluate(s1, s2)? s1 : s2;
    }
}
