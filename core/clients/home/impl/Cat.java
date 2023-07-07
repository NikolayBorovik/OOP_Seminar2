package OOP_Seminar2.core.clients.home.impl;

import OOP_Seminar2.core.clients.Runnable;
import OOP_Seminar2.core.clients.Soundable;
import OOP_Seminar2.core.clients.home.Pet;
import OOP_Seminar2.core.clients.owners.Owner;

import java.time.LocalDate;

/**
 Одна из реализаций домашнего животного
 */
public class Cat extends Pet implements Runnable, Soundable {
    public Cat() {
    }

    public Cat(int id, String name, int numberOfLimbs, LocalDate registrationDate, Owner owner) {
        super(id, name, numberOfLimbs, registrationDate, owner);
    }

    @Override
    public int run() {
        System.out.println(CLASS_NAME + " running at the speed of 12 km/h");
        return 12;
    }

    @Override
    public int sound() {
        System.out.println(CLASS_NAME + " meowed 5 times");
        return 5;
    }

}
