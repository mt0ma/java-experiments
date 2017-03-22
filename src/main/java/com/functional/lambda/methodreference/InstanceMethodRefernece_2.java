package com.functional.lambda.methodreference;

import com.functional.lambda.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Instance method reference of an existing object
 * (args) -> obj.instanceMethod(args) can be turned to obj::instanceMethod
 */
public class InstanceMethodRefernece_2 {

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Lulu", 10));
        persons.add(new Person("Lili", 8));


        ComparisonProvider comparisonProvider = new ComparisonProvider();
        //int compareTo
        Collections.sort(persons, (p1,p2) -> comparisonProvider.compareByName(p1, p2));
        // can be turend into
        Collections.sort(persons, comparisonProvider::compareByName);
    }
}
