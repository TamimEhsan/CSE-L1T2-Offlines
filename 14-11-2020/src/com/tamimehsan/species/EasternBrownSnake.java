package com.tamimehsan.species;

import com.tamimehsan.classes.Venomous;
import com.tamimehsan.genus.Reptile;

public class EasternBrownSnake extends Reptile implements Venomous {

    public EasternBrownSnake(String name, int age) {
        super(name, age);
    }

    @Override
    public boolean isLethalToAdultHumans() {
        return true;
    }

}
