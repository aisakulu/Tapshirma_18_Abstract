package com.peaksoft;

import com.peaksoft.animal.Cow;
import com.peaksoft.animal.Horse;
import com.peaksoft.animal.Sheep;

import java.util.Arrays;

public class Farm {
    private String ownerName;
    private String address;
    private Cow[] cows;
    private Horse[] horses;
    private Sheep[] sheeps;

    public Farm() {

    }

    public Farm(String ownerName, String address, Cow[] cows, Horse[] horses, Sheep[] sheeps) {
        this.ownerName = ownerName;
        this.address = address;
        this.cows = cows;
        this.horses = horses;
        this.sheeps = sheeps;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Cow[] getCows() {
        return cows;
    }

    public void setCows(Cow[] cows) {
        this.cows = cows;
    }

    public Horse[] getHorses() {
        return horses;
    }

    public void setHorses(Horse[] horses) {
        this.horses = horses;
    }

    public Sheep[] getSheeps() {
        return sheeps;
    }

    public void setSheeps(Sheep[] sheeps) {
        this.sheeps = sheeps;
    }

    @Override
    public String toString() {
        return "Farm{" +
                "\nownerName='" + ownerName + '\'' +
                ", \naddress='" + address + '\'' +
                ", \ncows=" + Arrays.toString(cows) +
                ", \nhorses=" + Arrays.toString(horses) +
                ", \nsheeps=" + Arrays.toString(sheeps) +
                '}';
    }
}
