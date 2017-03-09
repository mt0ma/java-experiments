package com.nested.local;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by miruna on 3/1/2017.
 */
public class LocalGreeting {

    public Greeting englishGreetings() {
        class EnglishGreeting implements Greeting {
            @Override
            public void morningGreeting() {
                System.out.println("Good morning!");
            }

            @Override
            public void eveningGreeting() {
                System.out.println("Good night!");
            }
        }

        EnglishGreeting eg = new EnglishGreeting();
        return eg;
    }

    public Greeting italianGreetings() {
        class ItalianGreeting implements Greeting {
            @Override
            public void morningGreeting() {
                System.out.println("Bon giorno!");
            }

            @Override
            public void eveningGreeting() {
                System.out.println("Buona notte!");
            }
        }

        ItalianGreeting ig = new ItalianGreeting();
        return ig;
    }

    public static void main(String[] args) {
        LocalGreeting lg = new LocalGreeting();

        List<Greeting> knownGreetings = new ArrayList<>();
        knownGreetings.add(lg.englishGreetings());
        knownGreetings.add(lg.italianGreetings());

        for(Greeting hg: knownGreetings) {
            hg.morningGreeting();
            hg.eveningGreeting();
        }
    }
}
