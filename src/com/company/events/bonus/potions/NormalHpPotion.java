package com.company.events.bonus.potions;

import com.company.characters.Hero;

public class NormalHpPotion extends Potion {

    public NormalHpPotion(String name, int hp) {
        super(name, hp);
    }

    public NormalHpPotion(){
        super("potion de soin normale", 2);
    }

    @Override
    public void interract(Hero h) {
        System.out.println("Je suis une petite potion, bois moi !");
        heal(h);
        System.out.println("Vous passez à " + h.getHp() + " de vie, n'est-ce pas formidable???");
    }
}
