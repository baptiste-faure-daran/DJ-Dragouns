package com.company.events.bonus.spells;

import com.company.characters.Hero;
import com.company.characters.Magician;

public class LightningBolt extends Spell {

    public LightningBolt(String name, int strength) {
        super(name, strength);
    }

    public LightningBolt() {
        super("Eclair qui pique", 2);
    }

    @Override
    public void interract(Hero h) {
        if (h instanceof Magician) {
            System.out.println("What a damn Pikachu!");
            buff(h);
            System.out.println("Vous passez à " + h.getStrength() + " de force, n'est-ce pas incroyable????");
        } else {
            System.out.println("Eh non tu n'a pas le QI pour l'utiliser tocard");
        }
    }
}
