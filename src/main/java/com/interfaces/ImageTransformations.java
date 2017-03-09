package com.interfaces;

/**
 * Created by miruna on 2/22/2017.
 */
public class ImageTransformations implements ImageTransformationsI{


    @Override
    public void enhanceImageQuality(Image image) {
        image.zoom(10);
        //other behaviour
    }
}
