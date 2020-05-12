package com.company;

public class MagicianClass {

    private String name;
    private String img;
    private int hp;
    private int strenght;


    public MagicianClass() {
        name = "Inconnu";
        img = "Inconnu";
        hp = 3;
        strenght = 8;
    }

    public MagicianClass(String nameChoose) {
        name = nameChoose;
        img = "Inconnu";
        hp = 3;
        strenght = 8;
    }

    public MagicianClass(String nameChoose, String imgChoose, int hpChoose, int strenghtChoose) {
        name = nameChoose;
        img = imgChoose;
        hp = hpChoose;
        strenght = strenghtChoose;
    }
    public String toString() {
        return "Nom du Magicien : " + this.getName() + " avec " + getImg() + " comme image et " + this.getHp() + " points de vie et " + this.getStrengh() + " de points de force";
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