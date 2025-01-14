//Ela Aguilar
package main;

public class Sphere {
    private final double radius;
    private static final double PI = 3.1416;

    public Sphere(double radius) {
        this.radius = radius;
    }
    //formula: 4/3(3.1416)(radius cube)
    public double getVolume() {
        return (4.0 / 3.0) * PI * radius * radius * radius;
    }
}