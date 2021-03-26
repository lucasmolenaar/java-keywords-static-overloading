package nl.novi.javaprogrammeren.four;

import nl.novi.javaprogrammeren.four.hidden.Human;
import nl.novi.javaprogrammeren.four.hidden.HumanMaker;

public class MainFour {

    public static void main(String[] args) {
        HumanMaker.createHuman("Lucas1");
        Human lucas = HumanMaker.createHuman("Lucas2");

        System.out.println(HumanMaker.getName(lucas));


    }
}
