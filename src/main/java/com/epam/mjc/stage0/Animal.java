package com.epam.mjc.stage0;

public class Animal {

    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal() {
    }

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription() {
        String varOfFur = (hasFur) ? "a" : "no";
        if (numberOfPaws > 1) {
            return "This animal is mostly" + " " + color + "." + " It has " + numberOfPaws + " " + "paws and " + varOfFur + " fur.";
        } else {
            return "This animal is mostly" + " " + color + "." + " It has " + numberOfPaws + " " + "paw and " + varOfFur + " fur.";
        }
    }
}
