package com.rocs.sphere.application;

import com.rocs.sphere.application.model.sphere.Sphere;

import java.util.Scanner;

public class SphereApplication{

public static void main (String[]args){
    Scanner scanner = new Scanner(System.in);

    int radius = 0;

    System.out.printf("Enter a volume of a sphere:");
    radius = scanner.nextInt();

    Sphere sphere = new Sphere(radius);

    System.out.println("The volume of the sphere is : " + sphere.getVolume() + "" +  " cubic units"  );


}

}
