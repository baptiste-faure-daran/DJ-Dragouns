package com.company.characters;

public class Warrior extends Hero {


    public Warrior() {
        super("Super Guerrier", 5, 5, 5, "Warrior", 5, 10, 5, 10);
    }
//        super("Le Super Guerrier", 5, 5, 10, "Guerrier");

    public Warrior(String name) {
        super(name, 5, 5, 10, "Guerrier");
    }
//        super(name, 5, 5, 10, "Guerrier")};

    public Warrior(String name, int hp, int strength, int attack, String type) {
        super(name, hp, strength, attack, "Guerrier");
    }

    public int getMinHp() {
        return minHp;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public int getMinStrength() {
        return minStrength;
    }

    public int getMaxStrength() {
        return maxStrength;
    }
}