package com.functional.lambda.methodreference;

import com.functional.lambda.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * Instance method reference of a particular type
 *  (obj, args) -> obj.instanceMethod(args)
 */
public class InstanceMethodReference_3 {

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Lulu", 10));
        persons.add(new Person("Lili", 8));

        persons.stream().filter(person -> person.isOlderThan10());

        //persons.stream().filter(person -> person::isOlderThan10);
    }
}
