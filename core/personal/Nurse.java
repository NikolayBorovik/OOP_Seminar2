package OOP_Seminar2.core.personal;

import OOP_Seminar2.core.clients.Animal;
import OOP_Seminar2.core.clients.Human;

public class Nurse extends Human implements Treat {

    public Nurse(String fullName) {
        super(fullName);
    }

    public void makeSurgery(){

    }

    @Override
    public void treat(Animal patient) {
        System.out.println("Adimistering medicine to " + patient.getName());
        System.out.println(patient.getName() + " treated.");
    }
}