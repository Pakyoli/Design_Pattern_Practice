package com.myspring.designpatterns.createPatterns.builderPattern;

/**
 * Created by Patrick on 7/25/17.
 */
public interface ComputerBuilderB {

    ComputerBuilderB addCpu(String cpu);
    ComputerBuilderB addRam(String ram);
    ComputerBuilderB addHdd(String hdd);
    ComputerBuilderB addMotherboard(String mb);
    ComputerBuilderB addGraphicsCard(String gc);
    ComputerBuilderB addPcCase(String pCase);
    Computer build();
}
