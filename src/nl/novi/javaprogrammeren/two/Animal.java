package nl.novi.javaprogrammeren.two;

public abstract class Animal {

    private int amountOfLegs;
    private String name;

    public Animal(int amountOfLegs, String name) {
        this.amountOfLegs = amountOfLegs;
        this.name = name;
    }

    public abstract void pet();

    public int getAmountOfLegs() {
        return amountOfLegs;
    }

    public String getName() {
        return name;
    }

}
