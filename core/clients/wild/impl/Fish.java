package OOP_Seminar2.core.clients.wild.impl;

import java.time.LocalDate;

import OOP_Seminar2.core.clients.Soundable;
import OOP_Seminar2.core.clients.Swimmable;
import OOP_Seminar2.core.clients.owners.Owner;
import OOP_Seminar2.core.clients.wild.WildAnimal;

public class Fish extends WildAnimal implements Swimmable {
    public Fish() {
    }

    public Fish(int id, int numberOfLimbs, LocalDate registrationDate, Owner owner) {
        super(id, numberOfLimbs, registrationDate, owner);
    }

    @Override
    public int swim() {
        System.out.println(CLASS_NAME + " swimming at the speed of 10 km/h");
        return 10;
    }
    
}
