package com.myspring.designpatterns.createPatterns.builderPattern;

/**
 * Created by Patrick on 7/25/17.
 */
public interface ComputerBuilderA {

    void addCpu();
    void addRam();
    void addHdd();
    void addMotherboard();
    void addGraphicsCard();
    void addPcCase();
    Computer build();
}
