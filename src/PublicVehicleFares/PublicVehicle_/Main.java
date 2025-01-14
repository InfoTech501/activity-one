package PublicVehicle_;

import java.util.Scanner;

public class Main {
    public static <PublicVehicleFares> void main (String[] args){
        Scanner sc = new Scanner(System.in);

        int distance;

        do {
            System.out.println("Enter your distance travelled:");
            while (!sc.hasNextInt()) {
                System.out.println("Invalid input. Please enter a valid number for the distance:");
                sc.next();
            }
            distance = sc.nextInt();

            if (distance <= 0) {
                System.out.println("Invalid input. distance must be greater than 0.");
            }
        } while (distance <= 0);


        PublicVehicle.PublicVehicle totalFare = new PublicVehicle.PublicVehicle(distance);


        System.out.println("The total fare is: " + totalFare.calculateFare());

    }

}