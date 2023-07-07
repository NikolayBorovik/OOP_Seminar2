package OOP_Seminar2.core.clients.wild.impl;

import OOP_Seminar2.core.clients.owners.Owner;
import OOP_Seminar2.core.clients.wild.WildAnimal;
import OOP_Seminar2.core.clients.Runnable;
import OOP_Seminar2.core.clients.Soundable;

import java.time.LocalDate;

/**
 Одна из реализаций дикого животного
 */
public class WildCat extends WildAnimal implements Runnable, Soundable {
    public WildCat() {
    }

    public WildCat(int id, int numberOfLimbs, LocalDate registrationDate, Owner owner) {
        super(id, numberOfLimbs, registrationDate, owner);
    }

    @Override
    public int run() {
        System.out.println(CLASS_NAME + " running at the speed of 15 km/h");
        return 15;
    }

    @Override
    public int sound() {
        System.out.println(CLASS_NAME + " meowed 2 times");
        return 2;
    }

}
