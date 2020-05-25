package com.company.events.bonus.spells;

import com.company.characters.Hero;

public class FireBall extends Spells {

    public FireBall(String name, int strength) {
        super(name, strength);
    }

    public FireBall() {
        super("Boule de feu", 5);
    }

    @Override
    public void interract(Hero h) {
        System.out.println("Salamèche GO !");
    }
}
