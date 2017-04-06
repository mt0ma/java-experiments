package com.annotations.examples.repeatable;

import java.lang.annotation.Repeatable;

@Repeatable(Colors.class)
public @interface Color {
    String name();
}