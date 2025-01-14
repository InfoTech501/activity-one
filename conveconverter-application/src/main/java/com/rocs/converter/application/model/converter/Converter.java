package com.rocs.converter.application.model.converter;

public class Converter {

    private double celsius;
    private double fahrenheit;

    public Converter(){

    }


    private Converter(double fahrenheit) {
        this.fahrenheit = fahrenheit;
        this.celsius = computeCelsius();

    }

    public static Converter createConverter(double fahrenheit) {
        return new Converter(fahrenheit);
    }


    public double getCelsius() {return this.celsius;}

    public double getFahrenheit() {
        return this.fahrenheit;
    }

    private double computeCelsius() {return (fahrenheit -32) * 5 / 9;}

    private double computeFahrenheit() {return (celsius * 9 / 5) + 32;}


}


