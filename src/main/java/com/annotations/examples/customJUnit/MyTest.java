package com.annotations.examples.customJUnit;

import org.junit.Test;

/**
 * Created by Victor Vlad Corcodel on 06/04/2017.
 */
public class MyTest {

    @TestMe
    public void testThis() {
        System.out.println("I'm alive!");
    }

    @IgnoreMe
    public void testThat() {
        System.out.println("I'm dead!");
    }

}
