package com.functional.exercises;

import org.junit.Assert;
import org.junit.Test;

/**
 * Making your own interfaces for which lambdas can be used. Your eventual goal is to make a
 method called betterString that takes two Strings and a lambda that says whether the first of the two
 is “better”. The method should return that better String; i.e., if the function given by the lambda
 returns true, the betterString method should return the first String, otherwise betterString should
 return the second String. Here are two examples of how your code should work when it is finished
 (the first lambda example returns whichever of string1 and string2 is longer, and the second lambda
 example always returns string1).
 • String string1 = ...;
 • String string2 = ...;
 • String longer = StringUtils.betterString(string1, string2, (s1, s2) -> s1.length() > s2.length());
 • String first = StringUtils.betterString(string1, string2, (s1, s2) -> true);
 Accomplishing all of this requires you to do three things:
 • Define the TwoStringPredicate interface. It will specify a method that takes 2 strings and returns a
 boolean. This interface is normal Java 7 code.
 • Define the static method betterString. That method will take 2 strings and an instance of your
 interface. It returns string1 if the method in interface returns true, string2 otherwise. This method
 is normal Java 7 code.
 • Call betterString. You can now use lambdas for the 3rd argument, as in the examples above.
 */

public class BasicLambdas2 {

    @Test
    public void testBetterStringByLength() {
        String string1 = "interface";
        String string2 = "class";

        String result = StringUtils.betterString(string1, string2, (s1, s2) -> s1.length() > s2.length());
        Assert.assertTrue(result.equals(string1));
    }

    @Test
    public void testBetterStringByFirstChar() {
        String string1 = "interface";
        String string2 = "class";

        String result = StringUtils.betterString(string1, string2, (s1, s2) -> s1.charAt(0) < s2.charAt(0));
        Assert.assertTrue(result.equals(string2));
    }
}
