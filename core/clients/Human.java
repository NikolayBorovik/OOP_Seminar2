package OOP_Seminar2.core.clients;

/**
 Абстракция человека
 */
public abstract class Human extends Animal { // todo на семинаре, в учебных целях, сделать extends Animal
    private final String fullName;

    public Human(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    @Override
    public String toString() {
        return CLASS_NAME + fullName;
    }
}
