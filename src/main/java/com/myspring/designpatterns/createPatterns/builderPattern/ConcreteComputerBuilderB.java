package com.myspring.designpatterns.createPatterns.builderPattern;

/**
 * Created by Patrick on 7/25/17.
 */
public class ConcreteComputerBuilderB implements ComputerBuilderB {

    private Computer computer = new Computer();

    @Override
    public ComputerBuilderB addCpu(String cpu) {
        computer.setCpu(cpu);
        return this;
    }

    @Override
    public ComputerBuilderB addRam(String ram) {
        computer.setRam(ram);
        return this;
    }

    @Override
    public ComputerBuilderB addHdd(String hdd) {
        computer.setHdd(hdd);
        return this;
    }

    @Override
    public ComputerBuilderB addMotherboard(String mb) {
        computer.setMotherboard(mb);
        return this;
    }

    @Override
    public ComputerBuilderB addGraphicsCard(String gc) {
        computer.setGraphicsCard(gc);
        return this;
    }

    @Override
    public ComputerBuilderB addPcCase(String pCase) {
        computer.setPcCase(pCase);
        return this;
    }

    @Override
    public Computer build() {
        System.out.println("Your computerB is ready for pick up.");
        return computer;
    }
}
