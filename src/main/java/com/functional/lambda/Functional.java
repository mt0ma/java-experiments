package com.functional.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * Created by miruna on 3/22/2017.
 */
public class Functional {

    public static void main(String[] args) {
        Supplier<List<Person>> personsList = ArrayList::new;
        Consumer<String> printMyName = System.out::println;

        Predicate<Person> nameStartsWithD = person -> person.getName().startsWith("D");
        Function<Person, String> nameToUppercase = person -> person.getName().toUpperCase();

        personsList.get().stream()
                .filter(nameStartsWithD)
                .map(nameToUppercase)
                .forEach(printMyName);
    }
}
