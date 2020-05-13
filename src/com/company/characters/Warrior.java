package com.company.characters;

public class Warrior {

    private String name;
    private String img;
    private int hp;
    private int strenght;

    public Warrior() {
        name = "Inconnu";
        img = "Inconnu";
        hp = 5;
        strenght = 5;
    }

    public Warrior(String nameChoose) {
        name = nameChoose;
        img = "Inconnu";
        hp = 5;
        strenght = 5;
    }

    public Warrior(String nameChoose, String imgChoose, int hpChoose, int strenghtChoose) {
        name = nameChoose;
        img = imgChoose;
        hp = hpChoose;
        strenght = strenghtChoose;
    }

    public String toString() {
        return "Nom du Guerrier : " + this.getName() + " avec " + getImg() + " comme image et " + this.getHp() + " points de vie et " + this.getStrengh() + " de points de force";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getStrengh() {
        return strenght;
    }

    public void setStrengh(int strengh) {
        this.strenght = strengh;
    }
}