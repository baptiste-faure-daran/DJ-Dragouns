package com.company.characters;

import com.company.Hero;

public class Warrior extends Hero {



    public Warrior() {
        super("Le Super Guerrier", 5, 5, 10, "Guerrier");
    }

    public Warrior(String name) {
        super(name, 5, 5, 5, "Guerrier");
    }

    public Warrior(String name, int hp, int strength, int attack, String type) {
        super(name, hp, strength, attack, "Guerrier");

    }

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

    public void setStrength(int strength) {
        this.strength = strength;
    }

}