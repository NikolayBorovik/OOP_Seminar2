package OOP_Seminar2;

import java.time.LocalDate;

import OOP_Seminar2.core.VetClinic;
import OOP_Seminar2.core.clients.Animal;
import OOP_Seminar2.core.clients.home.impl.Cat;
import OOP_Seminar2.core.clients.home.impl.Dog;
import OOP_Seminar2.core.clients.home.impl.Lizard;
import OOP_Seminar2.core.clients.owners.Owner;
import OOP_Seminar2.core.clients.wild.impl.Duck;
import OOP_Seminar2.core.clients.wild.impl.Fish;
import OOP_Seminar2.core.clients.wild.impl.WildCat;
import OOP_Seminar2.core.clients.Runnable;
import OOP_Seminar2.core.clients.Soundable;
import OOP_Seminar2.core.clients.Swimmable;

/**
 Небольшая шпаргалка по синтаксису java:

 1) Названия классов в java - существительные с большой буквы верблюжьей нотацией: CamelCase;
 2) названия методов - отглагольные, с маленькой буквы, верблюжьей нотацией: getUserById;
 3) Названия переменных - существительные с маленькой буквы, верблюжьей нотацией: maxCount;
 4) названия пакетов в java существительные, всегда с маленькой буквы и в одно слово;
 -! Если логика классов внутри пакета не позволяет назвать все в одно существительное, надо вложить один пакет в другой.
 */
public class Main {
    public static void main(String[] args) {
        // Cat homeCat =
        //         new Cat(2, "Tom", 4, LocalDate.of(2022, 4,13), new Owner("Ivanov Ivan"));

        // WildCat wildCat = new WildCat(
        //                 1, 4, LocalDate.of(2023, 1, 5), new Owner("incognito"));

        // homeCat.hunt();
        // wildCat.hunt();

        // Dog dog = new Dog();
        // dog.setName("fff");

        // System.out.println(homeCat);
        // System.out.println(dog);

        VetClinic vetClinic = new VetClinic("Healthy Animals");
        System.out.println(vetClinic.getName());;
        vetClinic.addPatient(new Dog(1, "Sharik", 0, null, null));
        vetClinic.addPatient(new WildCat(2, 0, null, null));
        vetClinic.addPatient(new Lizard(3, null, 0, null, null));
        vetClinic.addPatient(new Duck(4, 0, null, null));

        // vetClinic.getAllPatients();
        // System.out.println("____________");
        // vetClinic.getRunnable();
        // System.out.println("____________");
        // vetClinic.getSwimmable();
        // System.out.println("____________");
        // vetClinic.getFlyable();
        // System.out.println("____________");
        // vetClinic.getSoundable();
        // System.out.println("____________");

        // Dog dog = new Dog();
        // dog.sound();
        // Cat cat = new Cat();
        // cat.sound();
        // Duck duck = new Duck();
        // duck.fly();
        // Fish fish = new Fish();
        // fish.swim();



    }
}
