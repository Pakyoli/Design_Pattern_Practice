package com.myspring.designpatterns.createPatterns.abstractFactoryPattern;

/**
 * Created by Patrick on 7/25/17.
 */
public class Desktop implements Computer {

    public Desktop() {
        build();
    }

    @Override
    public void build() {
        System.out.println("Building a new desktop computer");
    }
}
