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

    private int plate;
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

    public void move() throws PersonnageHorsPlateauException {

            int dice = diceThrow();
            try {
                Thread.sleep(800);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Vous avez fait " + dice);
            position += dice;
            System.out.println("Vous êtes sur la case n° " + position);
            tour++;
            System.out.println("Au tour numéro : " + tour);

            if (position > plate) {
                throw new PersonnageHorsPlateauException();
            }





    }

    public void StartGame(Hero hero) throws PersonnageHorsPlateauException {
        Plate newPlate = new Plate();
        System.out.println("\n\n");
        while (this.position < this.plate) {
            System.out.println("Debut du tour numéro : " + this.tour);
            move();
            System.out.println("Vous êtes sur la case numéro : " + this.position);

            newPlate.getCase(this.position).interract(hero);

        }
        System.out.println("Vous avez Gagné !");
        Scanner scan = new Scanner(System.in);
        System.out.print("Si vous souhaitez rejouez appuyez sur 'a' et sinon sur 'q' pour quitter :");
        endGame(scan.next().toUpperCase());

    }

    public void endGame(String choice) throws PersonnageHorsPlateauException {
        if (choice.equals("Q")) {
            System.exit(0);
        } else if (choice.equals("A")) {
            move();
        }

    }

}


