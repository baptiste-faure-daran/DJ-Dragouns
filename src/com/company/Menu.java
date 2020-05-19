package com.company;

import com.company.characters.Hero;
import com.company.characters.Magician;
import com.company.characters.Warrior;

import java.util.Scanner;


public class Menu {

    // Méthode chose (choose je sais ^^")

    // Si tu instancies ton Hero ici et que tu veux l'utiliser ailleurs
    // pense à le retourner (mot clé return)
    public Hero chose() {
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
                    Hero w1 = new Warrior();
                    createCharacter(w1);
                    // isReady devient Vrai ce qui me permet de sortir de la boucle While
                    isReady = true;
                    return w1;
                }
                case "MAGICIEN" -> {
                    // Dans le cas où la valeur entrée est égale à "MAGICIEN"
                    System.out.println("Vous avez choisi le " + playerChoice + ", parce que l'auto-aim c'est ton truc Timmy --' ");
                    Hero m1 = new Magician();
                    createCharacter(m1);
                    // isReady devient Vrai ce qui me permet de sortir de la boucle While
                    isReady = true;
                    return m1;
                }
                case "ECHAP" -> {
                    // Dans le cas où la valeur entrée est égale à "ECHAP"
                    System.out.println("Vous avez quitté le jeu");
                    // isReady devient Vrai ce qui me permet de sortir de la boucle While
                    isReady = false;
                    return null;
                }
                // Si jamais aucun des cas ci-dessus ne se réalise, le default se lance
                default -> System.out.println("Veuillez entrer un choix valide");

            }


        }
        return null;

    }


    // Création de l'objet "createCharacter" me permettant de transcrire ce playerChoice en création de personnage
    public void createCharacter(Hero h) {


                /* Name
                Je demande à l'utilisateur de rentrer le nom de son Guerrier que je récupère grâce à l'instanciation d'un scanner
                */
        Scanner inputName = new Scanner(System.in);
        System.out.print("Rentrer un nom pour votre valeureux " + h.getType() + " : ");
        String nameChosen = inputName.nextLine();
        // J'utilise le setter de Warrior pour que nameChosen (scanner) deviennt le name de mon Warrior
        h.setName(nameChosen);

                /* Hp
                Je fais les mêmes manipulation avec les hp
                 */
        Scanner inputHp = new Scanner(System.in);
        System.out.print("Combien de points de vie souhaitez vous attribuer à votre " + h.getType() + "? : ");
        int hpChosen = inputHp.nextInt();

        // Penser à faire appelle à nextLine() du Scanner après un nextInt()
        // (retour à la ligne de la tete de lecture du Scanner)
        inputHp.nextLine();
        h.setHp(hpChosen);

                /* Strenght
                Mêmes manipulations avec la strength
                 */
        Scanner inputStrenght = new Scanner(System.in);
        System.out.print("Combien de force souhaitez vous lui attribuer : ");
        int strenghtChosen = inputStrenght.nextInt();
        inputStrenght.nextLine();
        h.setStrength(strenghtChosen);
        System.out.println(h.toString());
//        System.out.println("Vous avez un Guerrier nommé " + selected.getName() + " avec " + selected.getHp() + " points de vie et " + selected.getStrength() + " points de force.");

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Appuyer sur Start pour commencer");
        String start = keyboard.nextLine();
//                if (start.equals()

        System.out.println("Le jeu a débuté");


    }

}
