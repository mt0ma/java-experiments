package com.annotations.examples.documentation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by miruna on 4/6/2017.
 */
@Retention(RetentionPolicy.SOURCE)
@Documented
public @interface CodeInfo {
    String author();
    String date();
    String description() default "Documentation";
}
