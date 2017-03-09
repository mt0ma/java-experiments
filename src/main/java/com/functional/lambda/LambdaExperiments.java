package com.functional.lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created by miruna on 3/8/2017.
 */
public class LambdaExperiments {

    /**
     * https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html
     * @param args
     */
    public static void main(String[] args) {
        Person p1 = new Person("Lala", 10);
        Person p2 = new Person("Lulu", 8);

        List<Person> persons = new ArrayList<>();
        persons.add(p1);
        persons.add(p2);

        // background
        persons.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        // the lambda way
        persons.sort((o1,o2) -> o1.getName().compareTo(o2.getName()));

    }
}
