package com.functional.exercises;

import org.junit.Assert;
import org.junit.Test;

/**
 * Making generically-typed interfaces for which lambdas can be used. Use generics to replace
 your String-specific solutions to problem 3 with generically typed solutions. That is, replace betterString
 with betterEntry and TwoStringPredicate with TwoElementPredicate. Make sure your previous
 examples still work when you only change betterString to betterElement. But, now you should
 also be able to supply two Cars and a Car predicate, two Employees and an Employee predicate,
 etc. For example:
 • ElementUtils.betterElement(string1, string2, (s1, s2) -> s1.length() > s2.length())
 • ElementUtils.betterElement(car1, car2, (c1, c2) -> c1.getPrice() > c2.getPrice())
 • ElementUtils.betterElement(employee1, employee2, (e1, e2) -> e1.getSalary() > e2.getSalary())
 */

public class BasicLambdas3 {

    @Test
    public void testBetterStringByLength() {
        String string1 = "interface";
        String string2 = "class";

        String result = StringUtils.betterEntry(string1, string2, (s1, s2) -> s1.length() > s2.length());
        Assert.assertTrue(result.equals(string1));
    }
}
