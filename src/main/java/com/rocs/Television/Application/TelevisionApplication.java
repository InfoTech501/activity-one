package com.rocs.Television.Application;

import com.rocs.Television.Application.model.television.Television;
import java.util.Scanner;

public class TelevisionApplication {

    public static void main(String[] args) {
        Television tv = new Television();
        Scanner scanner = new Scanner(System.in);
        int selection; // Enhance the code's readability.

        System.out.println("Welcome User to Noah's Television"); // Introduction of the Television


        do {
            System.out.println();
            System.out.println(" Please select an Option below: "); // A user-friendly prompt of the Television
            System.out.println("---------------------------");
            System.out.println(" Channel: " + tv.getChannel());
            System.out.println(" Volume:  " + tv.getVolume());
            System.out.println("----------------------------");
            System.out.println("1. Increase Channel"); // Changes the Television channel by increasing the digit
            System.out.println("2. Decrease Channel"); // Changes the Television channel by decreasing the digit
            System.out.println("3. Select Channel"); // Changes the Television channel by user desire channel
            System.out.println("4. Increase Volume"); // Increases the Channel's volume
            System.out.println("5. Decrease Volume"); // Decreases the Channel's volume
            System.out.println("6. Turn TV Off"); // Changed phrasing for consistency
            System.out.println();
            System.out.print("Enter your selection (1-6): "); // Commands for the Television

            try {
                selection = scanner.nextInt();
            } catch (java.util.InputMismatchException e) {
                System.out.println("Oops! Invalid input. Please enter another number between 1 and 6.");
                scanner.nextLine(); // it clears the invalid input
                selection = 0; // Resets the selection
            }

            switch (selection) {
                case 1:
                    tv.increaseChannel();
                    break;
                case 2:
                    tv.decreaseChannel();
                    break;
                case 3:
                    System.out.print("Enter Channel number: "); // The user can select a channel from 1-10
                    try {
                        int newChannel = scanner.nextInt();
                        tv.selectChannel(newChannel);
                    } catch (java.util.InputMismatchException e) {
                        System.out.println("Oops! Invalid input. Please enter another number."); // Signals the user that the channel is invalid
                        scanner.nextLine(); // it clears the invalid input
                    }
                    break;
                case 4:
                    tv.increaseVolume();
                    break;
                case 5:
                    tv.decreaseVolume();
                    break;
                case 6:
                    break; // Exit the loop
                default:
                    System.out.println("Invalid selection. Please try again."); // Signals the user that the command is invalid
                    break;
            }

        } while (selection != 6);

        System.out.println();
        System.out.println("TV is off, thanks for watching! :)"); // It turns off the television
        System.out.println();
    }
}