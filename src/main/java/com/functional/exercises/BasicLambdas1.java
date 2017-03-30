package com.functional.exercises;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 1. Basic lambdas. Make an array containing a few Strings. Sort it by
 • length (i.e., shortest to longest)
 (Hint: this exact solution was shown in the lecture)
 • reverse length (i.e., longest to shortest)
 (Hint: minor variation of the first bullet)
 • alphabetically by the first character only
 (Hint: charAt(0) returns the numeric code for the first character)
 • Strings that contain “e” first, everything else second. For now, put the code directly in the lambda.
 (Hint: remember that the body of a lambda is allowed to have curly braces and a return statement.
 See the first two lambda examples in the notes.)
 • Redo the previous problem, but use a static helper method so that your lambda looks like this:
 Arrays.sort(words, (s1,s2) -> Utils.yourMethod(s1,s2))
 */

public class BasicLambdas1 {

    static List<String> list = Arrays.asList("basic", "lambda", "example", "Entity", "array", "containing", "sort", "eeee", "length", "reverse", "solution");

    public static void main(String[] args) {
        List<String> shortestToLongest = list.stream()
                .sorted((s1, s2) -> s1.length() - s2.length())
                .collect(Collectors.toList());
        System.out.println("shortestToLongest: "+shortestToLongest);

        List<String> longestToShortest = list.stream()
                .sorted((s1, s2) -> s2.length() - s1.length())
                .collect(Collectors.toList());
        System.out.println("longestToShortest: "+longestToShortest);

        List<String> firstChar = list.stream()
                .sorted((s1, s2) -> s1.charAt(0) - s2.charAt(0))
                .collect(Collectors.toList());
        System.out.println("firstChar : "+firstChar);

        List<String> containsE = list.stream()
                .sorted((s1, s2) -> {
                    if (s1.toLowerCase().charAt(0) == 'e' && s2.toLowerCase().charAt(0) != 'e') {
                        return -1;
                    }
                    if (s1.toLowerCase().charAt(0) != 'e' && s2.toLowerCase().charAt(0) == 'e') {
                        return 1;
                    }
                    return s1.compareTo(s2);
                })
                .collect(Collectors.toList());
        System.out.println("containsE: "+containsE);

    }
}
