package com.company;

import com.company.characters.Magician;
import com.company.characters.Warrior;

import java.util.Scanner;


public class Menu {

    // Méthode chose (choose je sais ^^")
    public void chose() {
        // Je crée un Boolean de vérification que je détermine comme faux initialement
        boolean isReady = false;
        // Je détermine "playerChoice" comme un String vide

        // Tant que isReady est faux
        while (!isReady) {
            // Instancier un nouveau Scanner
            Scanner scanner = new Scanner(System.in);
            System.out.println("Veuillez choisir votre personnage (Guerrier / Magicien) ou Echap pour quitter le jeu : ");
            // Ce qui sera entré dans l'espace alloué au scanner deviendra valeur de PlayerChoice (en majuscule)
            String playerChoice = scanner.nextLine().toUpperCase();

            switch (playerChoice) {
                // Dans le cas où la valeur entrée est égale à "GUERRIER"
                case "GUERRIER" -> {
                    System.out.println("Vous avez choisi le " + playerChoice + ", préparez vous à roxer du mob !!");
                    Hero W1 = new Warrior();
                    createCharacter(W1);
                    // isReady devient Vrai ce qui me permet de sortir de la boucle While
                    isReady = true;
                }
                case "MAGICIEN" -> {
                    // Dans le cas où la valeur entrée est égale à "MAGICIEN"
                    System.out.println("Vous avez choisi le " + playerChoice + ", parce que l'auto-aim c'est ton truc Timmy --' ");
                    Hero M1 = new Magician();
                    createCharacter(M1);
                    // isReady devient Vrai ce qui me permet de sortir de la boucle While
                    isReady = true;
                }
                case "ECHAP" -> {
                    // Dans le cas où la valeur entrée est égale à "ECHAP"
                    System.out.println("Vous avez quitté le jeu");
                    // isReady devient Vrai ce qui me permet de sortir de la boucle While
                    isReady = false;
                }
                // Si jamais aucun des cas ci-dessus ne se réalise, le default se lance
                default -> System.out.println("Veuillez entrer un choix valide");
            }


        }

    }

    // Création de l'objet "createCharacter" me permettant de transcrire ce playerChoice en création de personnage
    public Hero createCharacter(Hero selected) {
        /* Etant donné que mon Main doit rester le plus concis possible, j'appel dans ce dernier la méthode createCharacter
        qui elle renvoit à "chose" avant de s'initialiser
        */
        String type = selected.getType();


                /* Name
                Je demande à l'utilisateur de rentrer le nom de son Guerrier que je récupère grâce à l'instanciation d'un scanner
                */
        Scanner inputName = new Scanner(System.in);
        System.out.print("Rentrer un nom pour votre valeureux " + type + " : ");
        String nameChosen = inputName.nextLine();
        // J'utilise le setter de Warrior pour que nameChosen (scanner) deviennt le name de mon Warrior
        selected.setName(nameChosen);

                /* Hp
                Je fais les mêmes manipulation avec les hp
                 */
        Scanner inputHp = new Scanner(System.in);
        System.out.print("Combien de points de vie souhaitez vous attribuer à votre Guerrier? : ");
        int hpChosen = inputHp.nextInt();
        selected.setHp(hpChosen);

                /* Strenght
                Mêmes manipulations avec la strength
                 */
        Scanner inputStrenght = new Scanner(System.in);
        System.out.print("Combien de force souhaitez vous attribuer : ");
        int strenghtChosen = inputStrenght.nextInt();
        selected.setStrength(strenghtChosen);
        System.out.println(selected.toString());
//        System.out.println("Vous avez un Guerrier nommé " + selected.getName() + " avec " + selected.getHp() + " points de vie et " + selected.getStrength() + " points de force.");

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Appuyer sur Start pour commencer");
        String start = keyboard.nextLine();
//                if (start.equals()

        System.out.println("Le jeu a débuté");
        return selected;

    }


    public void modifyCharacter() {


    }
}
