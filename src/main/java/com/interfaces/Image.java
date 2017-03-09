package com.interfaces;

/**
 * Created by miruna on 2/22/2017.
 */
public interface Image {
    int _instanceCount = new Integer(0);

    void zoom(int ratio);

    static int instanceCount() {
      return _instanceCount;
    };

    // I'm newly added to this interface
    default String iAmNew() {
        return "default behaviour";
    }
}
