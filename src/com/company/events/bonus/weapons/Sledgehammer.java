package com.company.events.bonus.weapons;

import com.company.characters.Hero;
import com.company.characters.Warrior;

public class Sledgehammer extends Weapon {

    public Sledgehammer(String name, int strength) {
        super(name, strength);
    }

    public Sledgehammer() {
        super("Marteau", 3);
    }

    @Override
    public void interract(Hero h) {
        if (h instanceof Warrior) {
            System.out.println("Une bien belle massue que voilà !");
            h.setStrength(this.strength + h.getStrength());
            System.out.println("Vous passez à " + h.getStrength() + " de force, n'est-ce pas incroyable????");
        } else {
            System.out.println("Eh non tu ne peux pas te servir de ça petite fille en robe");
        }

    }
}
