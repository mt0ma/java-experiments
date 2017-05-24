package com.threads.simple;

/**
 * Created by miruna on 5/24/2017.
 */
public class MySimpleThread1 implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        // call device
        // store value intr-o colectie thread safe
    }

    public static void main(String[] args) {
        MySimpleThread1 myRunnable = new MySimpleThread1();
        Thread thread = new Thread(myRunnable); // new state
        thread.start(); // runnable state
    }
}
