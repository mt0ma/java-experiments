package com.tutorial;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

/**
 * Created by Victor Vlad Corcodel on 22/03/2017.
 */

public class Exercise_Lambdas {

    static Supplier<List<Task>> mytasks = () -> {
        List list = new ArrayList<>();
        list.add(new Task("t1", "reading"));
        list.add(new Task("t2", "listening"));
        list.add(new Task("t3", "reading"));
        return list;
    };

    public static void main(String[] args) {
        List<Task> tasks = mytasks.get();
        List<String> titles = taskTitles(tasks);
        for (String title : titles) {
            System.out.println(title);
        }

        titles.forEach(title -> System.out.println(title));

        titles.forEach(System.out::println);
    }

    public static List<String> taskTitles(List<Task> tasks) {
//        List<String> readingTitles = new ArrayList<>();
//        for (Task task : tasks) {
//            if (task.getType().equals("reading")) {
//                readingTitles.add(task.getTitle());
//            }
//        }

        List<String> newList = tasks.stream()
                .filter(task -> task.getType().equals("reading"))
                .map(task -> task.getTitle())
                .collect(Collectors.toList());

        return newList;
    }

}