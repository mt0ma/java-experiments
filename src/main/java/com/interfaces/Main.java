package com.interfaces;

/**
 * Created by miruna on 2/22/2017.
 */
public class Main
{

    public static void main(String[] args) {
        Image jpeg = new JPEGImage();
        //Image png = new PNGImage();
        System.out.println(jpeg.iAmNew());

        ImageTransformationsI transformations = new ImageTransformations();
        transformations.enhanceImageQuality(jpeg);
    }
}
