package com.company.events.ennemies;

import com.company.characters.Hero;
import com.company.engine.Case;

public abstract class Vilains implements Case {
    protected String name;
    protected int hp;
    protected int strength;

    public Vilains(String name, int hp, int strength) {
        this.name = name;
        this.hp = hp;
        this.strength = strength;
    }

    @Override
    public void interract(Hero h) {


    }

    public String toString() {
        return "Je suis un : " + this.name + "avec : " + this.strength + " de points de force et : " + this.hp + " points de vie !";
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

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }
}
