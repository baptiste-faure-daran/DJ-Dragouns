package com.company.events.bonus.weapons;

import com.company.characters.Hero;

public class Sword extends Weapon {

    public Sword(String name, int strength) {
        super(name, strength);
    }

    public Sword() {
        super("Sword", 5);
    }

    @Override
    public void interract(Hero h) {
        System.out.println("Une bien belle épée que voilà !");
    }
}
