package com.staticexamples;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by miruna on 2/7/2017.
 */
public class Persoana {

    public static Integer countObject = 0;
    public static final List<String> myStaticList = new ArrayList<>();

    public Persoana() {
        countObject++;
    }

    private void myPrivateMethod() {
        System.out.println("myPrivateMethod: You called me!");
    }

    public static void main(String[] args) {
        Persoana p1 = new Persoana();

        System.out.println("Numar de obiecte Persoana " + Persoana.countObject);

        for(int i=0; i<10; i++) {
            Persoana p = new Persoana();
        }
        System.out.println("Numar de obiecte Persoana " + Persoana.countObject);

    }
}
