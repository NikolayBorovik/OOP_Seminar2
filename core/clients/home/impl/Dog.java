package OOP_Seminar2.core.clients.home.impl;

import OOP_Seminar2.core.clients.Runnable;
import OOP_Seminar2.core.clients.Soundable;
import OOP_Seminar2.core.clients.Swimmable;
import OOP_Seminar2.core.clients.home.Pet;
import OOP_Seminar2.core.clients.owners.Owner;

import java.time.LocalDate;

/**
 Одна из реализаций домашнего животного
 */
public class Dog extends Pet implements Runnable, Soundable, Swimmable {
    public Dog() {
    }

    public Dog(int id, String name, int numberOfLimbs, LocalDate registrationDate, Owner owner) {
        super(id, name, numberOfLimbs, registrationDate, owner);
    }

    @Override
    public int swim() {
        System.out.println(CLASS_NAME + " swimming at the speed of 4 km/h");
        return 4;
    }

    @Override
    public int run() {
        System.out.println(CLASS_NAME + " running at the speed of 13 km/h");
        return 13;
    }

    @Override
    public int sound() {
        System.out.println(CLASS_NAME + " barked 5 times");
        return 5;
    }
}
