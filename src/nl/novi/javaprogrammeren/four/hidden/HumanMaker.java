package nl.novi.javaprogrammeren.four.hidden;

public class HumanMaker {

    private Human human;

    public HumanMaker() {
    }

    public static Human createHuman(String name) {
        return new Human("Lucas");
    }

    public static String getName(Human human) {
        return human.getName();
    }
}
