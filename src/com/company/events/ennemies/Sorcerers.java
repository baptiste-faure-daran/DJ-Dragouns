package com.company.events.ennemies;

import com.company.characters.Hero;

public class Sorcerers extends Vilains {

    public Sorcerers(String name, int hp, int strength) {
        super(name, hp, strength);
    }
    public Sorcerers() {
        super("Un super Sorcier", 10, 7);
    }

    @Override
    public void interract(Hero h) {
        System.out.println("Gandalf le blanc ?");
    }
}
