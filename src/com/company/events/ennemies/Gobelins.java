package com.company.events.ennemies;

import com.company.characters.Hero;

public class Gobelins extends Vilains{

    public Gobelins(String name, int hp, int strength) {
        super(name, hp, strength);
    }

    public Gobelins() {
        super("Un vicieux Gobelin", 6,1);
    }

    @Override
    public void interract(Hero h) {
        System.out.println("Nouvel habitant de la Moria laul");
    }
}
