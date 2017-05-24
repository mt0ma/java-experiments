package com.threads.simple;

/**
 * Created by Victor Vlad Corcodel on 24/05/2017.
 */
public class Thread3Example {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        print();
    }

    private static void print() {
        System.out.println(Thread.currentThread().getName());
        System.out.println("Printing!");
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();
    }

}

class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}