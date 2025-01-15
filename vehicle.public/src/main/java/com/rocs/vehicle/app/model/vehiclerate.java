package com.rocs.vehicle.app.model;

public class vehiclerate {
    private int distance;

    public vehiclerate(int distance){
        this.distance = distance;

    }



    public void setDistance(int distance){
        this.distance = distance;
    }
    public int getDistance() {return distance;}

    public double calculateFare(){
        if (distance <= 5) {
            return 9.0;
        } else {
            int extraKilometers = distance - 5;
            double fare = 9 + extraKilometers;
            return fare;
        }
    }
}