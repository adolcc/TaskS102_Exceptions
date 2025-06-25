package level2.application;

import static level2.model.Input.*;

public class Main {

    public static void main(String[] args) {
        byte age = readByte("Enter your age");
        int number = readInt("Enter an integer number");
        float height = readFloat("Enter your height");
        double weight = readDouble("Enter your weight");
        char initial = readChar("Enter the initial of your name");
        String name = readString("Enter your full name");
        boolean likesProgramming = readYesNo("Do you like programming");

        System.out.println("\nSummary:");
        System.out.println("Age: " + age);
        System.out.println("Number: " + number);
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight);
        System.out.println("Initial: " + initial);
        System.out.println("Name: " + name);
        System.out.println("Likes programming: " + (likesProgramming ? "Yes" : "No"));
    }
}

