package PHYSICS;
import UI.EnergyUI;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EnergyUI EngUI = new  EnergyUI();
        EngUI.MainUI();
        //Creating an Object

        Energy Object = new Energy();
        Scanner input = new Scanner(System.in);

        System.out.println("Please choose an operation:");
        System.out.println("1. Calculate potential energy");
        System.out.println("2. Calculate kinetic energy");
        System.out.println("3. Calculate Force");
        System.out.println("4. Calculate power");
        System.out.println("5. Calculate WorkDone");
        
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
                case 2:
                    System.out.println("Enter the mass (in kg):");
                    float mass1 = input.nextFloat();
                    System.out.println("Enter the velocity (in m/s):");
                    float velocity = input.nextFloat();
                    result = Object.calculateKineticEnergy(mass1, velocity);
                    break;

                case 3:
                    System.out.println("Enter the mass (in kg):");
                    float mass2 = input.nextFloat();
                    System.out.println("Enter the distance (in meters):");
                    float distance = input.nextFloat();
                    result = Object.calculateForce(mass2, distance);
                    break;

                case 4:
                    System.out.println("Enter the work (in J):");
                    float work = input.nextFloat();
                    System.out.println("Enter the time (in seconds):");
                    float time = input.nextFloat();
                    result = Object.calculatePower(work, time);
                    break;

                case 5:
                    System.out.println("Enter the force (in Newton):");
                    float force = input.nextFloat();
                    System.out.println("Enter the distance (in meters):");
                    float distance1 = input.nextFloat();
                    result = Object.calculateWorkDone(force, distance1);
                    break;

            }

            System.out.println("Result: " + result);

        } catch (Exception e) {
            System.out.println("Try Again Please.");
        }
    }
}
