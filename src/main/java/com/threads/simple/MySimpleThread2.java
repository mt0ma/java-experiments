package com.threads.simple;

/**
 * Created by miruna on 5/24/2017.
 */
public class MySimpleThread2 extends Thread {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

    @Override
    public synchronized void start() {
        System.out.println("Will call run method");
        super.start();
    }

    public static void main(String[] args) {
        MySimpleThread2 thread = new MySimpleThread2(); // new state
        thread.start(); // runnable state
    }
}
