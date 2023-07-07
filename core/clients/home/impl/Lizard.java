package OOP_Seminar2.core.clients.home.impl;

import java.time.LocalDate;

import OOP_Seminar2.core.clients.Swimmable;
import OOP_Seminar2.core.clients.Runnable;
import OOP_Seminar2.core.clients.home.Pet;
import OOP_Seminar2.core.clients.owners.Owner;

public class Lizard extends Pet implements Runnable, Swimmable {
    public Lizard() {
    }

    public Lizard(int id, String name, int numberOfLimbs, LocalDate registrationDate, Owner owner) {
        super(id, name, numberOfLimbs, registrationDate, owner);
    }

    @Override
    public int swim() {
        System.out.println(CLASS_NAME + " swimming at the speed of 2 km/h");
        return 2;
    }

    @Override
    public int run() {
        System.out.println(CLASS_NAME + " running at the speed of 3 km/h");
        return 3;
    }
}