package nl.novi.javaprogrammeren.two;

public class Dog extends Animal {

    public Dog(int amountOfLegs, String name) {
        super(amountOfLegs, name);
    }

    @Override
    public void pet() {
        System.out.println("I like being pet :)");
    }
}

