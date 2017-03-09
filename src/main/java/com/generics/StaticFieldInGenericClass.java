package com.generics;

/**
 * Created by miruna on 2/6/2017.
 */
public class StaticFieldInGenericClass<T> {
    public T property;
    public static int count = 0;
    // static context exists once per raw context, independent of the generic type
    //static T testProperty;

    public <T> StaticFieldInGenericClass() {
        count++;
    }

    public T getProperty() {
        return property;
    }

    public void setProperty(T property) {
        this.property = property;
    }

    public static void main(String[] args) {
        StaticFieldInGenericClass<String> stringInstance = new StaticFieldInGenericClass<>();
        System.out.println(StaticFieldInGenericClass.count);

        StaticFieldInGenericClass<Integer> integerInstance = new StaticFieldInGenericClass<>();
        System.out.println(StaticFieldInGenericClass.count);
    }
}
