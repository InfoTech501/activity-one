package com.rocs.weather.application.model.weather;


public class temperature {

    private double degrees;
    private  double celcius;
    private double fahrenheit;


    public temperature(double celcius) {
        this.celcius = celcius;
        this.fahrenheit = computeFahrenheit();
        this.degrees = computeCelcius();
    }


    public double getCelcius() {
        return celcius;
    }

    public double getFahrenheit() {
        return fahrenheit;
    }

    private double getDegrees() {
        return degrees;
    }

    private double computeDegrees() {
        return degrees;
    }

    private double computeCelcius(){return (fahrenheit - 32) * 5/9;}

    private double computeFahrenheit(){return (celcius * 9/5) + 32;}


}
