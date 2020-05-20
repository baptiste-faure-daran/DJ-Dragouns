package com.company.engine;

import com.company.characters.PersonnageHorsPlateauException;

import java.util.Scanner;

public class Play {
    private final int plate = 64;
    int playerPosition;

    public int diceThrow() {
        int dice = (int) (1 + 6 * Math.random());

        return dice;

    }

    public void move() throws PersonnageHorsPlateauException {
        String choice = "";
        int tour = 0;
        int position = 0;

        while (position < plate) {
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


