//Problem 2: Design a Temperature class that converts degree Celsius to degree Fahrenheit and vice versa.
//Gerome Liwanag
import java.util.Scanner;

public class Temperature {
    double value;
    char scale;

    public Temperature(double value, char scale) {
        this.value = value;
        this.scale = scale;
        System.out.println("DEBUG: Temp obj created with " + value + " " + scale);
    }

    public double toFahrenheite() {
        if (scale == 'C' || scale == 'c') {
            double result = (value * 9 / 5) + 32;
            return result;
        }
        System.out.println("DEBUG: Already Fahrenheit. No need to convert.");
        return value;
    }

    public double toCelsius() {
        if (scale == 'F' || scale == 'f') {
            double result = (value - 32) * 5 / 9;
            return result;
        }
        System.out.println("DEBUG: Already Celsius. No need to convert.");
        return value;
    }

    public void showTemperature() {
        System.out.println("The temperature is " + value + " " + scale);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter temp value: ");
        double value = sc.nextDouble();

        System.out.println("Enter scale (C/F): ");
        char scale = sc.next().charAt(0);

        if (scale != 'C' && scale != 'c' && scale != 'F' && scale != 'f') {
            System.out.println("Invalid scale entered.");
            return;
        }

        Temperature temp = new Temperature(value, scale);
        temp.showTemperature();

        if (scale == 'C' || scale == 'c') {
            System.out.println("In Fahrenheit: " + temp.toFahrenheite() + " F");
            System.out.println("Vice versa: " + value + "C = " + temp.toFahrenheite() + "F");
        } else if (scale == 'F' || scale == 'f') {
            System.out.println("In Celsius: " + temp.toCelsius() + " C");
            System.out.println("Vice versa: " + value + "F = " + temp.toCelsius() + "C");
        }

    }
}