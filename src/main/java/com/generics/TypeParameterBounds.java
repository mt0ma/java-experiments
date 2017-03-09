package com.generics;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by miruna on 2/6/2017.
 */
public class TypeParameterBounds {

    // Class<T extends Class & Interface1 & Interface2 & ... & Interfacen)
    class Box<T extends Number & Cloneable> {

    }

}
