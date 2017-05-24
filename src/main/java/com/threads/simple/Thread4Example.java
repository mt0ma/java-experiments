package com.threads.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Victor Vlad Corcodel on 24/05/2017.
 */
public class Thread4Example implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" run()");
        for (int i = 0; i < 4; i++) {
            System.out.println(Thread.currentThread().getName() + " i=" + i);
        }
    }

    public static void main(String[] args) {
        //first method
//        Thread4Example thread4Example = new Thread4Example();
//        Thread thread0 = new Thread(thread4Example);
//        Thread thread1 = new Thread(thread4Example);
//        thread0.start();
//        thread1.start();

        //second method
        List<Runnable> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Thread4Example thread4Example = new Thread4Example();
            list.add(thread4Example);
        }
        list.forEach(r -> new Thread(r).start());
    }
}
