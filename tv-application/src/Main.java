//Del Mundo

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        television tv = new television();
        TVController controller = new TVController(tv);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome! Turn the TV ON to begin. ");
        System.out.println("Press 1 to turn ON the TV, or any other key to exit. ");

        if (scanner.nextInt() == 1) {
            tv.power();
            controller.Remote();
        } else {
            System.out.println("power off ");
        }

        scanner.close();
    }
}
