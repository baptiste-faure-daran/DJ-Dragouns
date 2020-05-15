package com.company;

import javax.xml.transform.Source;
import java.net.SocketOption;
import java.sql.SQLOutput;

public class PersonnageHorsPlateauException extends Exception{

    public PersonnageHorsPlateauException() {
        super("Vous avez dépassé la case finale, dommage...");

    }
}
