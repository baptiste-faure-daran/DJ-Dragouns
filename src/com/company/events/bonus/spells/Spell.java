package com.company.events.bonus.spells;

import com.company.characters.Hero;
import com.company.engine.Case;

public abstract class Spell implements Case {
    protected String name;
    protected int strength;

    public Spell(String name, int strength) {
        this.name = name;
        this.strength = strength;
    }
    public void buff(Hero h){
        h.updateMagicalStrength(this);
    }

    public String toString() {
        return "Nom de votre sort: " + this.name + "avec : " + this.strength + " de points de force !";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }

    public String getName() {
        return name;
    }
}
