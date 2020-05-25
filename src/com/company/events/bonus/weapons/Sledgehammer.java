package com.company.events.bonus.weapons;

import com.company.characters.Hero;

public class Sledgehammer extends Weapon {

    public Sledgehammer(String name, int strength) {
        super(name, strength);
    }

    public Sledgehammer() {
        super("Marteau", 3);
    }

    @Override
    public void interract(Hero h) {
        System.out.println("Une bien belle massue que voilà !");
    }
}
