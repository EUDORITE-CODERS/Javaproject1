package PHYSICS;
import UI.EnergyUI;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EnergyUI EngUI = new  EnergyUI();
        EngUI.MainUI();
        //Creating an Object

        Energy Object = new Energgy();
        Scanner input = new Scanner(System.in);

        System.out.println("Please choose an operation:");
        System.out.println("1. Calculate potential energy");

        try {
            int choice = input.nextInt();
            float result = 0;

            switch (choice) {
                case 1:
                    System.out.println("Enter the mass (in kg):");
                    float mass = input.nextFloat();
                    System.out.println("Enter the height (in meters):");
                    float height = input.nextFloat();
                    result = Object.calculatePotentialEnergy(mass, height);
                    break;

            }

            System.out.println("Result: " + result);

        } catch (Exception e) {
            System.out.println("Try Again Please.");
        }
    }
}
