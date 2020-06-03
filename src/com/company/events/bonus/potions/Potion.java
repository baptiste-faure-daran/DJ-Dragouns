package com.company.events.bonus.potions;


import com.company.characters.Hero;
import com.company.engine.Case;

public abstract class Potion implements Case {
    protected String name;
    protected int hp;

    public Potion(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public void heal(Hero h) {
        h.updateHp(this);
    }

    public String toString(){
        return "Je suis une : " + this.name + " qui va te rendre " + this.hp + " points de vie !";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}
