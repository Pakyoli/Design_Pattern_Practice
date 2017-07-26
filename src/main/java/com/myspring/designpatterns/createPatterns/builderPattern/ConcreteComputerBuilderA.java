package com.myspring.designpatterns.createPatterns.builderPattern;

/**
 * Created by Patrick on 7/25/17.
 */
public class ConcreteComputerBuilderA implements ComputerBuilderA {

    private Computer computer = new Computer();

    @Override
    public void addPcCase() {
        computer.setPcCase("Phanteks ENTHOO ELITE PH-ES916E_AG");
        System.out.println("Case is ready...");
    }

    @Override
    public void addMotherboard() {
        computer.setMotherboard("ASUS Rampage");
        System.out.println("MB installed...");
    }

    @Override
    public void addCpu() {
        computer.setCpu("Core i9 7900x");
        System.out.println("CPU installed...");
    }

    @Override
    public void addRam() {
        computer.setRam("64gb DDR4");
        System.out.println("Ram installed...");
    }

    @Override
    public void addHdd() {
        computer.setHdd("1TB SSD");
        System.out.println("HDD installed...");
    }

    @Override
    public void addGraphicsCard() {
        computer.setGraphicsCard("GeForce GTX 1080 Ti");
        System.out.println("Graphics card installed...");
    }

    @Override
    public Computer build() {
        System.out.println("Your computerA is ready for pick up.");
        return computer;
    }
}
