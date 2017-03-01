package com.simplon.designpattern.PlantFactory;

/**
 * Created by jerome on 01/03/17.
 */
public class PlantFactoryDemo {
    public static void main(String[] args) {
        PlantFactory plantFactory = new PlantFactory();
        Plant plant1 = plantFactory.getPlant("tomato");
        plant1.putFertilizer();
        plant1.putWaterLevel();
        System.out.println(plant1);
    }
}
