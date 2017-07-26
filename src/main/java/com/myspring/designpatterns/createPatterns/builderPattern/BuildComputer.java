package com.myspring.designpatterns.createPatterns.builderPattern;

/**
 * Created by Patrick on 7/25/17.
 */
public class BuildComputer {

    private ComputerBuilderA computerBuilderA = new ConcreteComputerBuilderA();
    private ComputerBuilderB computerBuilderB = new ConcreteComputerBuilderB();

    public Computer buildA() {
        this.computerBuilderA.addPcCase();
        this.computerBuilderA.addMotherboard();
        this.computerBuilderA.addCpu();
        this.computerBuilderA.addRam();
        this.computerBuilderA.addHdd();
        this.computerBuilderA.addGraphicsCard();
        return computerBuilderA.build();
    }

    public Computer buildB() {
        return this.computerBuilderB
                    .addPcCase("Phanteks ENTHOO ELITE PH-ES916E_AG")
                    .addMotherboard("ASUS Rampage")
                    .addCpu("Core i9 7900x")
                    .addRam("64gb DDR4")
                    .addHdd("1TB SSD")
                    .addGraphicsCard("GeForce GTX 1080 Ti")
                    .build();
    }
}
