package com.rocs.weather.application;

import com.rocs.weather.application.model.weather.temperature;

import java.util.Scanner;

public class WeatherApplication {

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        double degrees = 0;

        System.out.println("Enter degrees: ");
        degrees = sc.nextDouble();

        temperature mytemperature = new temperature(degrees);

        System.out.printf("Temperature in Celcius is " + mytemperature.getCelcius());
        System.out.printf("Temperature in Fahrenheit is " + mytemperature.getFahrenheit());

    }


}
