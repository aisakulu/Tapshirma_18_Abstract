package com.peaksoft.animal;

public class Cow extends Animal{

    public Cow() {
    }

    public Cow(double weight, byte age, String gender, String nickName) {
        super(weight, age, gender, nickName);
    }

    @Override
    public String toString() {
        return "Cow{} " + super.toString();
    }
}
