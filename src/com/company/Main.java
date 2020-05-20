package com.company;

import com.company.characters.Hero;
import com.company.characters.PersonnageHorsPlateauException;
import com.company.engine.Menu;
import com.company.engine.Play;

public class Main {
    public static void main(String[] args){
        Menu start = new Menu();
        // 1. Si return alors il faut stocker le résultat
        Hero h = start.chose();
        System.out.println(h.toString());
        Play go = new Play();
        try {
        go.move();
        } catch (PersonnageHorsPlateauException e) {
            e.printStackTrace();
        };



    }
}
//public class Main {
//
//    public static void main(String[] args) {
//        WarriorClass Johny = new WarriorClass();
//        System.out.println("Constructeur vide " + Johny.getName());
//
//        WarriorClass Fabrice = new WarriorClass("PhilippeGuerrier");
//        System.out.println("Constructeur avec nom en seul paramètre " + Fabrice.getName());
//
//        WarriorClass Zinedine = new WarriorClass("Zidane", "imageDrole", 5, 5);
//        System.out.println(Zinedine.toString());
//
//    }
//}
