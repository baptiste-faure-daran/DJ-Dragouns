package com.company.events.bonus.potions;

import com.company.characters.Hero;

public class NormalHpPotion extends Potions {

    public NormalHpPotion(String name, int hp) {
        super(name, hp);
    }

    public NormalHpPotion(){
        super("potion de soin normale", 3);
    }

    @Override
    public void interract(Hero h) {
        System.out.println("Je suis une petite potion, bois moi !");
    }
}
