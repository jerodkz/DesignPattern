package com.simplon.designpattern.PlantFactory;

import java.util.Objects;

public class Tomato implements Plant {

    private String name;
    private int waterLevel;
    private int fertilizer;

    public Tomato(String name,int waterLevel,int fertilizer) {
        this.name = name;
        this.waterLevel = waterLevel;
        this.fertilizer = fertilizer;
    }

    @Override
    public void putWaterLevel() {
        this.waterLevel += 1;
    }

    @Override
    public void putFertilizer() {
        this.fertilizer += 5;
    }

    @Override
    public String toString() {
        return "Tomato{" +
                "name='" + name + '\'' +
                ", waterLevel=" + waterLevel +
                ", fertilizer=" + fertilizer +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tomato tomato = (Tomato) o;
        return waterLevel == tomato.waterLevel &&
                fertilizer == tomato.fertilizer &&
                Objects.equals(name, tomato.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, waterLevel, fertilizer);
    }
}
