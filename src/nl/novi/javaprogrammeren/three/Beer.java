package nl.novi.javaprogrammeren.three;

public class Beer {
    private String brand;
    private static int numOfBeers = 0;

    public Beer(String brand) {
        this.brand = brand;
        System.out.println("Er is weer een biertje getapt!");

        numOfBeers++;
        System.out.println("Dit is biertje nummer: " + numOfBeers);
    }

    public static int getTappedBeersAmount() {
        return numOfBeers;
    }

    public static void drink() {
        System.out.println("gluckgluckgluck");
    }

    public int getAmountOfBeersTapped() {
        return 30;
    }
 }
