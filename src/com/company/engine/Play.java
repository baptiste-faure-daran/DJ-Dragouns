package com.company.engine;

import com.company.characters.Hero;
import com.company.characters.PersonnageHorsPlateauException;
import com.company.characters.Warrior;
import com.company.events.bonus.weapons.Sledgehammer;
import com.company.events.bonus.weapons.Sword;
import com.company.events.bonus.weapons.Weapon;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Play {

    private final int plate;
    private int position;
    private int tour;
    private Hero hero;

    public Play(Hero hero) {
        this.plate = 64;
        this.position = 0;
        this.tour = 0;
        this.hero = hero;

    }

    private int diceThrow() {
        int dice = (int) (1 + 6 * Math.random());

        return dice;
    }

    public void move(Hero hero) throws PersonnageHorsPlateauException {

//            try {
//                Thread.sleep(800);
//
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        Plate newPlate = new Plate();
        boolean jouer = false;
        while (!jouer) {
            int dice = diceThrow();
            Scanner scan = new Scanner(System.in);
            System.out.println("Si vous souhaitez lancer les dès : PRESS N");
            String again = scan.nextLine().toUpperCase();

            if (again.equals("N")) {
                System.out.println("Vous avez fait " + dice);
                position = hero.getPosition() + dice;
                hero.setPosition(position);
//                position += dice;
                System.out.println("Vous êtes sur la case n° " + position);
                newPlate.getCase(this.position).interract(hero);
                System.out.println("POSITION du héro :" +hero.getPosition());

                tour++;
                System.out.println("Au tour numéro : " + tour);

                if (position > plate) {
                    throw new PersonnageHorsPlateauException();
                }
            } else {
                endGame(hero);
                jouer = true;
            }
        }
    }

    public void endGame(Hero hero) throws PersonnageHorsPlateauException {
        Scanner scan = new Scanner(System.in);
        System.out.print("Si vous souhaitez continuer appuyez sur 'a' et sinon sur 'q' pour quitter :");
        String choice = scan.nextLine().toUpperCase();
        if (choice.equals("Q")) {
            System.exit(0);
        } else if (choice.equals("A")) {
            move(hero);
        }

    }

}


