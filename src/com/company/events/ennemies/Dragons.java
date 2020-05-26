package com.company.events.ennemies;

import com.company.characters.Hero;

public class Dragons extends Vilains {

    public Dragons(String name, int hp, int strength) {
        super(name, hp, strength);
    }

    public Dragons() {
        super("Gros Dragon", 15, 4);
    }

    @Override
    public void interract(Hero h) {
        System.out.println("Miaou je suis un Dragon !");
        while ((h.getHp() > 0) && (this.hp > 0)) {
            this.hp = this.hp - h.getStrength();
            h.setHp(h.getHp() - this.strength);
            if (this.hp < 0) {
                System.out.println("Drakarys is dead ma gueule | et fait gaffe t'as plus que " + h.getHp() + " points de vie !");
            } else if (h.getHp()<0){
                System.out.println("I think you're dead Buddy :/ ");
            } else {
                System.out.println("Il vous reste " + h.getHp() + " points de vie et " + this.hp + " à ce gros toutou qui crache du feu");
            }
        }
    }
}
