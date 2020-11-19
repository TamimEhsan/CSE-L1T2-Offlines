package com.tamimehsan.genus;

import com.tamimehsan.classes.Animal;

public class Mammal extends Animal {

    private boolean warmBlooded;

    public Mammal(String name, int age,boolean isWarmblooded) {
        super(name, age);
        warmBlooded = isWarmblooded;
    }

    public void printBloodType(){
        if( warmBlooded){
            System.out.print(", Warm-Blooded!");
        }
    }

}
