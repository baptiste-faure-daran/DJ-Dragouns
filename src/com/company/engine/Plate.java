package com.company.engine;

import com.company.events.ennemies.Dragons;
import com.company.events.ennemies.Gobelins;
import com.company.events.ennemies.Sorcerers;
import jdk.jfr.Event;

import java.util.ArrayList;

abstract class Plate {


    int totalCase;
    ArrayList<Plate> plate;


    public Plate(int totalCase) {
        this.totalCase = totalCase;
        this.plate = new ArrayList<Plate>();
        for (int i = 0; i < totalCase; i++) {

            Event event;

            switch (i) {
                case 45, 52, 56, 62:
                    Plate = new Dragons();
                    break;

                case 10, 28, 25, 32, 35, 36, 37, 48, 44, 47:
                    Plate = new Sorcerers();

                case 3, 6, 9, 12, 15, 18, 21, 24, 27, 30:
                    Plate = new Gobelins();


            }

        }
    }

}
