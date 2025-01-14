package com.rocs.converter.application;

import com.rocs.converter.application.model.converter.Converter;
import java.util.Scanner;
public class ConverterApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double celsius = 0;
        double fahrenheit = 0;

        System.out.println("Enter Celsius: ");
        System.out.println("Enter Fahrenheit");

        celsius = scanner.nextDouble();
        fahrenheit = scanner.nextDouble();

        Converter myconverter = new Converter();

        System.out.println(celsius + "°C is equal to " + myconverter.getFahrenheit() + "°F");
        System.out.println(fahrenheit + "°F is equal to " + myconverter.getCelsius() + "°C");

    }
}
