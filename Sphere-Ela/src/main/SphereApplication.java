//Ela Aguilar
package main;
import java.util.Scanner;

public class SphereApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius of Sphere: ");
        double radius = sc.nextDouble();

        Sphere elasphere = new Sphere(radius);
        System.out.println("The volume of sphere is: " + elasphere.getVolume());
    }
}