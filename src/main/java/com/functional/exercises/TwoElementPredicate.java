package com.functional.exercises;

/**
 * Created by Victor Vlad Corcodel on 31/03/2017.
 */
@FunctionalInterface
public interface TwoElementPredicate <E> {

    boolean evaluate(E a, E b);
}
