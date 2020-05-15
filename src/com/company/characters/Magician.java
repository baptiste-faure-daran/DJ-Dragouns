package com.company.characters;

import com.company.Hero;

public class Magician extends Hero {




    public Magician() { super("Le super Magicien", 5, 3, 8, "Magicien"); }

    public Magician(String name) { super(name, 5, 3, 8, "Magicien"); }

    public Magician(String name, int hp, int strength, int attack, String type) { super(name, hp, strength, attack, "Magicien"); }

    public String toString() {
        return super.toString();
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

    public void setStrength(int strength) { this.strength = strength; }

}