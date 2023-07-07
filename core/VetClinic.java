package OOP_Seminar2.core;

import java.util.ArrayList;
import java.util.List;


import OOP_Seminar2.core.clients.Animal;
import OOP_Seminar2.core.clients.Animals;
import OOP_Seminar2.core.clients.Human;
import OOP_Seminar2.core.clients.home.impl.Cat;
import OOP_Seminar2.core.clients.home.impl.Dog;
import OOP_Seminar2.core.clients.Runnable;
import OOP_Seminar2.core.clients.Soundable;
import OOP_Seminar2.core.clients.Swimmable;
import OOP_Seminar2.core.clients.Flyable;

public class VetClinic {
    String name;
    private List<Animal> patients;
    protected final String CLASS_NAME = "The " + getClass().getSimpleName();

    public VetClinic(String name) {
        this.name = name;
        this.patients = new ArrayList <Animal>();
    }

    public void addPatient(Animal patient){
        patients.add(patient);
    }

    public void getAllPatients(){
        for (Animal item: patients) {
            System.out.println("1. " + item);
        }
    }

    public void getRunnable(){
        for (Animal item: patients) {
            if(item instanceof Runnable)
            System.out.println("1. " + item);
        }
    }
    public void getSwimmable(){
        for (Animal item: patients) {
            if(item instanceof Swimmable)
            System.out.println("1. " + item);
        }
    }

    public void getFlyable(){
        for (Animal item: patients) {
            if(item instanceof Flyable)
            System.out.println("1. " + item);
        }
    }

    public void getSoundable(){
        for (Animal item: patients) {
            if(item instanceof Soundable)
            System.out.println("1. " + item);
        }
    }

    public String getName(){
        return CLASS_NAME + " " + name;
    }

}
