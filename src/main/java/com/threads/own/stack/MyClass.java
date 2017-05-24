package com.threads.own.stack;

class MyThread extends Thread{
    public void run(){
        System.out.println("Current thread: " + Thread.currentThread().getName());
        System.out.println("in run() method");
    }
}

public class MyClass {
    public static void main(String...args){
        System.out.println("Current thread: " +  Thread.currentThread().getName());
        System.out.println("In main() method");
        method1();
    }

    static void method1(){
        System.out.println("Current thread: " + Thread.currentThread().getName());
        System.out.println("In method1() method");
        MyThread obj=new MyThread();
        obj.start();
    }
}