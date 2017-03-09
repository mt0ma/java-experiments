package com.interfaces;

/**
 * Created by miruna on 2/22/2017.
 */
public class JPEGImage implements Image {
    @Override
    public void zoom(int ratio) {
        System.out.println("JPEG" + ratio);
    }

    @Override
    public String iAmNew() {
        return "jpeg behaviour";
    }

}
