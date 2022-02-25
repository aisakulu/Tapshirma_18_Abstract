package com.peaksoft;

import com.peaksoft.animal.Cow;
import com.peaksoft.animal.Horse;
import com.peaksoft.animal.Sheep;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Cow cow1 = new Cow(400.5,(byte) 3,"Urgachi","Sari Kashka");
        Cow cow2 = new Cow(305.4,(byte)4,"Erkek","KaraAla");
        Cow cow3 = new Cow(1080.5,(byte)8,"Erkek","Boz");
        Cow cow4 = new Cow(205.4,(byte)5,"Erkek","Ak kashka");
        Cow cow5 = new Cow(608.4,(byte)1,"Erkek","Kapkara");

        Sheep sheep1 = new Sheep(23,(byte) 5,"Urgachi","Toktu");
        Sheep sheep2 = new Sheep(60,(byte) 2,"Kochkor","Gissar");
        Sheep sheep3 = new Sheep(80,(byte) 1,"Kochkor","Gissar Kozu");
        Sheep sheep4 = new Sheep(23,(byte) 5,"Urgachi","kozu");

        Horse horse1 = new Horse(800,(byte) 4,"Erkek","Suluk Kara");
        Horse horse2 = new Horse(950,(byte) 2,"Urgachi","Kishinek");
        Horse horse3 = new Horse(800,(byte) 8,"Erkek","Boika");

        Farm farm1 = new Farm("Habib","Nookat Toolos",new Cow[]{cow1,cow2,cow3,cow4,cow5},
                new Horse[] {horse1,horse2},new Sheep[] {sheep1,sheep2,sheep3});

        Farm farm2 = new Farm("Taalai","Nookat Jayilma",new Cow[]{cow5},
                new Horse[] {horse3},new Sheep[] {sheep4});

        System.out.println("Farm 1 : " + farm1);
        System.out.println();
        System.out.println("Farm 2 : " + farm2);
    }
}
