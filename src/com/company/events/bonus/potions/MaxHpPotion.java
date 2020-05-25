package com.company.events.bonus.potions;

import com.company.characters.Hero;

public class MaxHpPotion extends Potions {

    public MaxHpPotion(String name, int hp) {
        super(name, hp);
    }
    public MaxHpPotion() {
        super("sacrée potion de soin",5);
    }

    @Override
    public void interract(Hero h) {
        System.out.println("Je suis une grosse potion, bois moi !");
    }
}
