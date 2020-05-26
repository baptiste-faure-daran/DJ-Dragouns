package com.company.engine;

import com.company.events.EmptyCase;
import com.company.events.bonus.potions.MaxHpPotion;
import com.company.events.bonus.potions.NormalHpPotion;
import com.company.events.bonus.spells.FireBall;
import com.company.events.bonus.spells.LightningBolt;
import com.company.events.bonus.weapons.Sledgehammer;
import com.company.events.bonus.weapons.Sword;
import com.company.events.ennemies.Dragons;
import com.company.events.ennemies.Gobelins;
import com.company.events.ennemies.Sorcerers;
import com.company.events.ennemies.Vilains;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class Plate {


    ArrayList<Case> plate = new ArrayList<>();


    public Plate() {
        for (int i = 0; i < 64; i++) {

            if ((i == 19) || (i == 26) || (i == 42) || (i == 53)) {

//                Sword sword = new Sword();
                plate.add(new Sword());

            } else if ((i == 2) || (i == 5) || (i == 11) || (i == 22) || (i == 38)) {
//                Sledgehammer sledgehammer = new Sledgehammer();
                plate.add(new Sledgehammer());

            } else if ((i == 1) || (i == 4) || (i == 8) || (i == 17) || (i == 23)) {
//                LightningBolt lightningBolt = new LightningBolt();
                plate.add(new LightningBolt());

            } else if ((i == 48) || (i == 49)) {
//                FireBall fireBall = new FireBall();
                plate.add(new FireBall());

            } else if ((i == 45) || (i == 52) || (i == 56) || (i == 62)) {
                Dragons dragons = new Dragons();
                plate.add(new Dragons());

            } else if ((i == 10) || (i == 20) || (i == 25) || (i == 32) || (i == 35) || (i == 36) || (i == 37) || (i == 40) || (i == 44) || (i == 47)) {
//                Sorcerers sorcerers = new Sorcerers();
                plate.add(new Sorcerers());

            } else if ((i == 3) || (i == 6) || (i == 9) || (i == 12) || (i == 15) || (i == 18) || (i == 21) || (i == 24) || (i == 27) || (i == 30)) {
                Gobelins gobelins = new Gobelins();
                plate.add(new Gobelins());

            } else if ((i == 7) || (i == 13) || (i == 31) || (i == 33) || (i == 39) || (i == 43)) {
//                NormalHpPotion normalHpPotion = new NormalHpPotion();
                plate.add(new NormalHpPotion());

            } else if ((i == 28) || (i == 41)) {
//                MaxHpPotion maxHpPotion = new MaxHpPotion();
                plate.add(new MaxHpPotion());
            } else {
                plate.add(new EmptyCase());
            }
        }

    }

    public Case getCase(int index) {
        return plate.get(index);
    }
}
