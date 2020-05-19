package com.company.characters;

public class Warrior extends Hero {



    public Warrior() {
        super("Super Guerrier", 5, 5, 5, "Warrior");
        super.minHp = 5;
        super.maxHp = 10;
        super.minStrength = 5;
        super.maxStrength = 10;
    }
//        super("Le Super Guerrier", 5, 5, 10, "Guerrier");

    public Warrior(String name) { super(name, 5, 5, 10, "Guerrier");}
//        super(name, 5, 5, 10, "Guerrier")};

    public Warrior(String name, int hp, int strength, int attack, String type) { super(name, hp, strength, attack, "Guerrier"); }

    public int getMinHp() { return minHp; }

    public int getMaxHp() { return maxHp; }

    public int getMinStrength() { return minStrength; }

    public int getMaxStrength() { return maxStrength; }
}