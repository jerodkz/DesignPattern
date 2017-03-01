package com.simplon.designpattern.PlantFactory;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Created by jerome on 01/03/17.
 */
public class PlantFactoryTest {

    @Test
    public void getPlant_tomato(){
        //set
        PlantFactory plantFactory = new PlantFactory();
        Plant tomato = new Tomato("tomato",0,0);
        //test
         Plant result = plantFactory.getPlant("tomato");
        //assert
        assertEquals(tomato,result);
    }

    @Test
    public void getPlant_potato(){
        //set
        PlantFactory plantFactory = new PlantFactory();
        Plant potato = new Potato("potato",0,0);
        //test
        Plant result = plantFactory.getPlant("potato");
        //assert
        assertEquals(potato,result);
    }

    @Test
    public void getPlant_apple(){
        //set
        PlantFactory plantFactory = new PlantFactory();
        Plant apple = new Apple("apple",0,0);
        //test
        Plant result = plantFactory.getPlant("apple");
        //assert
        assertEquals(apple,result);
    }

    @Test
    public void getPlant_other_string(){
        //set
        PlantFactory plantFactory = new PlantFactory();
        //test
        Plant result = plantFactory.getPlant("");
        //assert
        assertEquals(null,result);
    }


}