package com.company.events.bonus.potions;


import com.company.engine.Case;

public abstract class Potions implements Case {
    protected String name;
    protected int hp;

    public Potions(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public String toString(){
        return "Je suis une : " + this.name + " qui va te rendre " + this.hp + " points de vie !";
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
}
