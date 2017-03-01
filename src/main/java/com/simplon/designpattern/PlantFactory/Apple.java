package com.simplon.designpattern.PlantFactory;


import java.util.Objects;

public class Apple implements Plant {

    private String name;
    private int waterLevel;
    private int fertilizer;

    public Apple(String name,int waterLevel,int fertilizer) {
        this.name = name;
        this.waterLevel = waterLevel;
        this.fertilizer = fertilizer;
    }

    @Override
    public void putWaterLevel() {
        this.waterLevel += 5;
    }

    @Override
    public void putFertilizer() {
        this.fertilizer += 2;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "name='" + name + '\'' +
                ", waterLevel=" + waterLevel +
                ", fertilizer=" + fertilizer +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Apple apple = (Apple) o;
        return waterLevel == apple.waterLevel &&
                fertilizer == apple.fertilizer &&
                Objects.equals(name, apple.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, waterLevel, fertilizer);
    }
}
