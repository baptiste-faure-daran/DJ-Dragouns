package com.company;

public class Main {
    public static void main(String[] args){
        Menu start = new Menu();
        start.chose();
        Play go = new Play();
        try {
        go.move();
        } catch (PersonnageHorsPlateauException e) {
            e.printStackTrace();
        }


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
