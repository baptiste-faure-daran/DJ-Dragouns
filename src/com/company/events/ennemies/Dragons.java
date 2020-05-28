package com.company.events.ennemies;

import com.company.characters.Hero;

public class Dragons extends Vilains {

    public Dragons(String name, int hp, int strength) {
        super(name, hp, strength);
    }

    public Dragons() {
        super("Gros Dragon", 15, 4);
    }

    @Override
    public void interract(Hero h) {
        System.out.println("Miaou je suis un Dragon !");
        attack(h);
    }
}
