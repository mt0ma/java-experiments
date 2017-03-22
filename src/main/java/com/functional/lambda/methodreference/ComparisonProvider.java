package com.functional.lambda.methodreference;

import com.functional.lambda.Person;

/**
 * Created by miruna on 3/22/2017.
 */
public class ComparisonProvider {
    public int compareByName(Person a, Person b) {
        return a.getName().compareTo(b.getName());
    }

    public int compareByAge(Person a, Person b) {
        return a.getAge().compareTo(b.getAge());
    }
}
