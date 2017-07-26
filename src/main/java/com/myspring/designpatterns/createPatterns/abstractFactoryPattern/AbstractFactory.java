package com.myspring.designpatterns.createPatterns.abstractFactoryPattern;

/**
 * Created by Patrick on 7/25/17.
 */
public interface AbstractFactory {
    Computer buildComputer(String type);
}
