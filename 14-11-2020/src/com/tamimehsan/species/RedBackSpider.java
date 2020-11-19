package com.tamimehsan.species;

import com.tamimehsan.classes.Venomous;
import com.tamimehsan.genus.Arachnid;

public class RedBackSpider extends Arachnid implements Venomous {
    
    public RedBackSpider(String name, int age) {
        super(name, age);
    }

    @Override
    public boolean isLethalToAdultHumans() {
        return false;
    }
}
