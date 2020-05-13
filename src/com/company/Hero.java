package com.company;

public abstract class Hero {
    protected String name;
    protected int hp;
    protected int strength;
    protected int attack;

    public Hero (String name, int hp, int strength, int attack){
        this.name = name;
        this.hp = hp;
        this.strength = strength;
        this.attack = attack;
    }
    public Hero (String pickName) {
        name = pickName;
    }
    public Hero(String pickName, int pickHp, int pickStrenght){

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

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }
}
