package com.company.events.bonus.weapons;

import com.company.engine.Case;

public abstract class Weapon implements Case {
    protected String name;
    protected int strength;

    public Weapon(String name, int strength) {
        this.name = name;
        this.strength = strength;
    }

    public String toString() {
        return "Nom de votre arme: " + this.name + "avec : " + this.strength + " de points de force !";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }
}
