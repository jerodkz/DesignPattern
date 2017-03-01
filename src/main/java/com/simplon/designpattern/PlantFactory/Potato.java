package com.simplon.designpattern.PlantFactory;


import java.util.Objects;

public class Potato implements  Plant {

    private String name;
    private int waterLevel;
    private int fertilizer;

    public Potato(String name,int waterLevel,int fertilizer) {
        this.name = name;
        this.waterLevel = waterLevel;
        this.fertilizer = fertilizer;
    }

    @Override
    public void putWaterLevel() {
        this.waterLevel += 2;
    }

    @Override
    public void putFertilizer() {
        this.fertilizer += 3;
    }

    @Override
    public String toString() {
        return "Potato{" +
                "name='" + name + '\'' +
                ", waterLevel=" + waterLevel +
                ", fertilizer=" + fertilizer +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Potato potato = (Potato) o;
        return waterLevel == potato.waterLevel &&
                fertilizer == potato.fertilizer &&
                Objects.equals(name, potato.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, waterLevel, fertilizer);
    }
}
