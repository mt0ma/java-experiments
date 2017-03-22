package com.functional.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;

/**
 * Created by miruna on 3/22/2017.
 */
public class Main {

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("A", 15));
        persons.add(new Person("B", 16));

        Person compareToPerson = new Person("C", 16);

        /*filterEquals(persons, compareToPerson, new ObjectsEqual() {
            @Override
            public boolean equals(Object o1, Object o2) {
                Person p1 = (Person)o1;
                Person p2 = (Person)o2;
                return p1.getAge().equals(p2.getAge());
            }
        });*/

        System.out.println(filterEquals(persons, compareToPerson, (o1,o2) -> {
            Person p1 = (Person)o1;
            Person p2 = (Person)o2;
            return p1.getAge().equals(p2.getAge());
        }));


    }

    private static List<Person> filterEquals(List<Person> initial, Person compareTo, BiPredicate<Person, Person> filteringCondition) {
        List<Person> filteredPersons = new ArrayList<>();

        for(Person p: initial) {
          if(filteringCondition.test(compareTo, p))
              filteredPersons.add(p);
        }

        return filteredPersons;
    }
}
