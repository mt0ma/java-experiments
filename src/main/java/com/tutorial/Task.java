package com.tutorial;

/**
 * Created by Victor Vlad Corcodel on 22/03/2017.
 */
public class Task {

    String title;
    String type;

    public Task(String title, String type) {
        this.title = title;
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
