package com.company;

public abstract class Hero {
    protected String type;
    protected String name;
    protected int hp;
    protected int strength;
    protected int attack;

    public Hero(String name, int hp, int strength, int attack, String type) {
        this.type = type;
        this.name = name;
        this.hp = hp;
        this.strength = strength;
        this.attack = attack;
    }

    public String toString() {
        return "[ You are a " + this.type
                + ", and your name is : " + this.name
                + " | Her.his current life is : " + this.hp
                + " | Her.his current strength is : " + this.strength
                + " ]";
    }
//    public Hero (String name) {
//        this(name, 0,0,0);
//    }
//
//    public Hero(){
//        this("Unknown", 0, 0, 0);
//    }

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
        this.hp = hp;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

}
