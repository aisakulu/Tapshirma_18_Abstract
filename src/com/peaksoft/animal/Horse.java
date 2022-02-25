package com.peaksoft.animal;

public class Horse extends Animal {

    public Horse() {
    }

    public Horse(double weight, byte age, String gender, String nickName) {
        super(weight, age, gender, nickName);
    }

    @Override
    public String toString() {
        return "Horse{} " + super.toString();
    }
}
