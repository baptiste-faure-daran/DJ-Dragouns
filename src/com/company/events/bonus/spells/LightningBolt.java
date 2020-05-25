package com.company.events.bonus.spells;

import com.company.characters.Hero;

public class LightningBolt extends Spells {

    public LightningBolt(String name, int strength) {
        super(name, strength);
    }

    public LightningBolt() {
        super("Eclair qui pique", 5);
    }

    @Override
    public void interract(Hero h) {
        System.out.println("Pikachu GO !");
    }
}
