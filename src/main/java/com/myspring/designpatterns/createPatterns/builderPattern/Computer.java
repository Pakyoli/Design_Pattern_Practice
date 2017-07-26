package com.myspring.designpatterns.createPatterns.builderPattern;

/**
 * Created by Patrick on 7/25/17.
 */
public class Computer {

    private String cpu;
    private String ram;
    private String hdd;
    private String motherboard;
    private String graphicsCard;
    private String pcCase;

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public void setHdd(String hdd) {
        this.hdd = hdd;
    }

    public void setMotherboard(String motherboard) {
        this.motherboard = motherboard;
    }

    public void setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    public void setPcCase(String pcCase) {
        this.pcCase = pcCase;
    }
}
