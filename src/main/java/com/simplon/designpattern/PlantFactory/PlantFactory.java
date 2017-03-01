package com.simplon.designpattern.PlantFactory;

public class PlantFactory {

    public Plant getPlant(String plantType){
        if(plantType == null){
            return null;
        }
        if(plantType.equalsIgnoreCase("TOMATO")){
            return new Tomato(plantType,0,0);

        } else if(plantType.equalsIgnoreCase("POTATO")){
            return new Potato(plantType,0,0);

        } else if(plantType.equalsIgnoreCase("APPLE")) {
            return new Apple(plantType,0,0);
        }

        return null;
    }
}

