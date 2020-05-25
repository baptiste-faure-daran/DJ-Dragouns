package com.company.events.bonus.spells;

import com.company.engine.Case;

public abstract class Spells implements Case {
    protected String name;
    protected int strength;

    public Spells(String name,int strength) {
        this.name = name;
        this.strength = strength;
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
}
