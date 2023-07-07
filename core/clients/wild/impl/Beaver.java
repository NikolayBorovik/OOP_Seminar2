package OOP_Seminar2.core.clients.wild.impl;

import java.time.LocalDate;

import OOP_Seminar2.core.clients.Runnable;
import OOP_Seminar2.core.clients.Swimmable;
import OOP_Seminar2.core.clients.owners.Owner;
import OOP_Seminar2.core.clients.wild.WildAnimal;

public class Beaver extends WildAnimal implements Runnable, Swimmable {
    public Beaver() {
    }

    public Beaver (int id, int numberOfLimbs, LocalDate registrationDate, Owner owner) {
        super(id, numberOfLimbs, registrationDate, owner);
    }

    @Override
    public int run() {
        System.out.println(CLASS_NAME + " running at the speed of 10 km/h");
        return 10;
    }

    @Override
    public int swim() {
        System.out.println(CLASS_NAME + " swimming at the speed of 7 km/h");
        return 7;
    }
    
}
