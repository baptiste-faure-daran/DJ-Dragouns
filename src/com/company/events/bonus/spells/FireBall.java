package com.company.events.bonus.spells;

import com.company.characters.Hero;
import com.company.characters.Magician;

public class FireBall extends Spells {

    public FireBall(String name, int strength) {
        super(name, strength);
    }

    public FireBall() {
        super("Boule de feu", 7);
    }

    @Override
    public void interract(Hero h) {
        if (h instanceof Magician) {
            System.out.println("What a damn Salamèche!");
            h.setStrength(this.strength + h.getStrength());
            System.out.println("Vous passez à " + h.getStrength() + " de force, n'est-ce pas incroyable????");
        } else {
            System.out.println("Eh non tu n'a pas le QI pour l'utiliser tocard");

        }
    }
}
