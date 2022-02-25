package com.peaksoft.animal;

public class Sheep extends Animal{

    public Sheep() {
    }

    public Sheep(double weight, byte age, String gender, String nickName) {
        super(weight, age, gender, nickName);
    }

    @Override
    public String toString() {
        return "Sheep{} " + super.toString();
    }
}
