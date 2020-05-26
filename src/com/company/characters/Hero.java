package com.company.characters;

import com.company.events.bonus.weapons.Weapon;

public abstract class Hero {
    protected String type;
    protected String name;
    protected int hp;
    protected int strength;
    protected int attack;
    protected Weapon weapon;

    protected int minHp;
    protected int maxHp;
    protected int minStrength;
    protected int maxStrength;


    public Hero(String name, int hp, int strength, int attack, String type) {
        this(name, hp, strength, attack, type, 5, 10, 5, 10);
    }

    public Hero(String name, int hp, int strength, int attack, String type, int minHp, int maxHp, int minStrength, int maxStrength) {
        this.type = type;
        this.name = name;
        this.hp = hp;
        this.strength = strength;
        this.attack = attack;
        this.minHp = minHp;
        this.maxHp = maxHp;
        this.minStrength = minStrength;
        this.maxStrength = maxStrength;


    }

    public String toString() {
        return "[ Vous êtes un " + this.type
                + ", et votre nom est : " + this.name
                + " | Avec : " + this.hp + " points de vie"
                + " | Et avec " + this.strength + " points de force"
                + " ]";
    }

    public String getType() {
        return type;
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
        if (hp > this.maxHp) {
            this.hp = this.maxHp;
        } else if (hp < this.minHp) {
            this.hp = this.minHp;
        } else {
            this.hp = hp;
        }
    }


    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        if (strength > maxStrength) {
            this.strength = this.maxStrength;
        } else if (strength < minStrength) {
            this.strength = this.minStrength;
        } else {
            this.strength = strength;
        }
    }
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

}
