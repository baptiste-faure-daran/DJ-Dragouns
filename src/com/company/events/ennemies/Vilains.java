package com.company.events.ennemies;

import com.company.characters.Hero;
import com.company.engine.Case;

import java.util.Random;
import java.util.Scanner;

public abstract class Vilains implements Case {
    protected String name;
    protected int hp;
    protected int strength;

    public Vilains(String name, int hp, int strength) {
        this.name = name;
        this.hp = hp;
        this.strength = strength;
    }

    public void attack(Hero h) {
        System.out.println("Vous tombez nez à nez avec un terrifiant " + this.name + " !");

        while ((h.getHp() > 0) && (this.hp > 0)) {
            Scanner fight = new Scanner(System.in);
            System.out.println("Souhaitez-vous Combattre (C) ou Fuir (F) ?");
            String answer = fight.nextLine().toUpperCase();
            if (answer.equals("C")) {
                this.hp = this.hp - h.getStrength();
                if  (this.hp <= 0) {
                    System.out.println("DAAAAMN HE NEEDS SOME MILK !");
                    break;
                }

                if (this.hp <= 0) {
                    System.out.println(this.name + " is dead ma gueule | et fait gaffe t'as plus que " + h.getHp()
                            + " points de vie !");
                    break;
                } else if (h.getHp() <= 0) {
                    System.out.println("I think you're dead Buddy :/ ");
                    break;
                } else {
                    System.out.println("Vous venez de l'attaquer, il vous reste toujours " + h.getHp() + " points de vie et " + this.hp + " au "
                            + this.name + " mais il se prépare à riposter");
                    h.setHpAfterAction(h.getHp() - this.strength);
                    System.out.println("Vous vous etes fait attaquer de " +this.strength );
                    System.out.println("Votre vie est désormais de " +h.getHp());

                }
            } else if (answer.equals("F")) {
                Random rand = new Random();
                int pose = rand.nextInt(6) + 1;
                System.out.println("Vous avez fuit de la case " + h.getPosition() + " jusqu'à" +
                        " vous retrouver sur la case " + (h.getPosition() - pose));
                runAway(h, (h.getPosition() - pose));
                break;

            }
        }
    }

    public void runAway(Hero h, int position) {
        h.setPosition(position);
    }

    public String toString() {
        return "Je suis un : " + this.name + "avec : " + this.strength + " de points de force et : " + this.hp
                + " points de vie !";
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
