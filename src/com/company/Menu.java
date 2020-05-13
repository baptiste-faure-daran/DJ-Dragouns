package com.company;

import com.company.characters.Magician;
import com.company.characters.Warrior;

import java.util.Scanner;


public class Menu {
    private String chose() {
        boolean isReady = false;
        String playerChoice = "";

        while (!isReady) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Veuillez choisir votre personnage (Guerrier / Magicien) ou Echap pour quitter le jeu : ");
            playerChoice = scanner.nextLine().toUpperCase();

            switch (playerChoice) {
                case "GUERRIER" -> {
                    System.out.println("Vous avez choisi le " + playerChoice + ", préparez vous à roxer du mob !!");
                    isReady = true;
                }
                case "MAGICIEN" -> {
                    System.out.println("Vous avez choisi le " + playerChoice + ", parce que l'auto-aim c'est ton truc Timmy --' ");
                    isReady = true;
                }
                case "ECHAP" -> {
                    System.out.println("Vous avez quitté le jeu");
                    isReady = false;
                }
                default -> System.out.println("Veuillez entrer un choix valide");
            }


        }



        return playerChoice;
    }


    public Object createCharacter() {
        String choice = chose();
        switch (choice) {
            case "GUERRIER" -> {

                Warrior W1 = new Warrior();

                // Name
                Scanner inputName = new Scanner(System.in);
                System.out.print("Rentrer un nom pour votre valeureux Guerrier : ");
                String nameChosen = inputName.nextLine();
                W1.setName(nameChosen);

                // Hp
                Scanner inputHp = new Scanner(System.in);
                System.out.print("Combien de points de vie souhaitez vous attribuer à votre Guerrier? : ");
                int hpChosen = inputHp.nextInt();
                W1.setHp(hpChosen);

                // Strenght
                Scanner inputStrenght = new Scanner(System.in);
                System.out.print("Combien de force souhaitez vous attribuer : ");
                int strenghtChosen = inputStrenght.nextInt();
                W1.setStrengh(strenghtChosen);
                System.out.println("Vous avez un Guerrier nommé " + W1.getName() + " avec " + W1.getHp() + " de point de vie et " + W1.getStrengh() +" de force.");
                Scanner startScanner = new Scanner(System.in);
                System.out.print("Entrer 'START' pour commencer :");

                String printStart = startScanner.nextLine().toUpperCase();
                System.out.println("Le jeu a débuté");
                return W1;

            }
            case "MAGICIEN" -> {

                Magician M1 = new Magician();

                // Name
                Scanner inputName = new Scanner(System.in);
                System.out.print("Rentrer un nom pour votre 'valheureux' Magicien : ");
                String nameChosen = inputName.nextLine();
                M1.setName(nameChosen);

                // Hp
                Scanner inputHp = new Scanner(System.in);
                System.out.print("Combien de points de vie souhaitez vous attribuer à votre Magicien? : ");
                int hpChosen = inputHp.nextInt();
                M1.setHp(hpChosen);

                // Strenght
                Scanner inputStrenght = new Scanner(System.in);
                System.out.print("Combien de force souhaitez vous attribuer : ");
                int strenghtChosen = inputStrenght.nextInt();
                M1.setStrengh(strenghtChosen);
                System.out.println("Vous avez un Magicien nommé " + M1.getName() + " avec " + M1.getHp() + " de point de vie et " + M1.getStrengh() +" de force.");
                Scanner startScanner = new Scanner(System.in);
                System.out.print("Entrer 'START' pour commencer :");

                String printStart = startScanner.nextLine().toUpperCase();
                System.out.println("Le jeu a débuté");
                return M1;
            }
            case "ECHAP" -> {
                Scanner esc = new Scanner(System.in);
                System.out.print("Si vous souhaitez quitter le jeu, entrez sur 'Echap' ");
                System.out.println("Vous avez décidé de quitter le jeu");
                System.exit(0);
            }

        }
        return choice;
    }
    public void modifyCharacter() {


    }
}
