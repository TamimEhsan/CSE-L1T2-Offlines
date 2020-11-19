package com.tamimehsan.species;

import com.tamimehsan.classes.Venomous;
import com.tamimehsan.genus.Mammal;

public class Platypus extends Mammal implements Venomous {

    public Platypus(String name, int age) {
        super(name, age,true);
    }

    @Override
    public boolean isLethalToAdultHumans() {
        return false;
    }
}
