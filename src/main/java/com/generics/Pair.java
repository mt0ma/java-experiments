package com.generics;

/**
 * Created by miruna on 2/6/2017.
 */
class Pair<X,Y>  {
    private X first;
    private Y second;
    public Pair(X a1, Y a2) {
        first  = a1;
        second = a2;
    }
    public X getFirst()  { return first; }
    public Y getSecond() { return second; }
    public void setFirst(X arg)  { first = arg; }
    public void setSecond(Y arg) { second = arg; }

    public static void main(String[] args) {
        // concrete instantiation
        Pair<Long, String> concreteType = new Pair<>(1L, "a");

        // wildcard instantiation - defines a family of types - "all types"
        Pair<?, ?> wildcardType = new Pair<>(1,2);

    }
}