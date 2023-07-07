package OOP_Seminar2.core.clients.wild.impl;

import java.time.LocalDate;

import OOP_Seminar2.core.clients.Flyable;
import OOP_Seminar2.core.clients.Swimmable;
import OOP_Seminar2.core.clients.Runnable;
import OOP_Seminar2.core.clients.Soundable;
import OOP_Seminar2.core.clients.owners.Owner;
import OOP_Seminar2.core.clients.wild.WildAnimal;

public class Duck extends WildAnimal implements Flyable, Runnable, Swimmable, Soundable {
    public Duck() {
    }

    public Duck(int id, int numberOfLimbs, LocalDate registrationDate, Owner owner) {
        super(id, numberOfLimbs, registrationDate, owner);
    }

    @Override
    public int fly() {
        System.out.println(CLASS_NAME + " flying at the speed of 5 km/h");
        return 5;
    }

    @Override
    public int run() {
        System.out.println(CLASS_NAME + " running at the speed of 4 km/h");
        return 4;
    }

    @Override
    public int swim() {
        System.out.println(CLASS_NAME + " swimming at the speed of 5 km/h");
        return 5;
    }

    @Override
    public int sound() {
        System.out.println(CLASS_NAME + " quakced 4 times");
        return 4;
    }
}
