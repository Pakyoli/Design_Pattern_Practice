package com.myspring.designpatterns.createPatterns.abstractFactoryPattern;

/**
 * Created by Patrick on 7/25/17.
 */
public class Laptop implements Computer {

    public Laptop() {
        build();
    }

    @Override
    public void build() {
        System.out.println("Preparing a laptop computer");
    }
}
