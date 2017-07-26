package com.myspring.designpatterns.createPatterns.abstractFactoryPattern;

/**
 * Created by Patrick on 7/25/17.
 */
public class ComputerFactory implements AbstractFactory {

    @Override
    public Computer buildComputer(String type) {
        return "Desktop".equals(type) ? new Desktop() : new Laptop();
    }
}
