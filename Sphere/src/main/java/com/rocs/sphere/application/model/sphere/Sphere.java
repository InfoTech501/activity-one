package com.rocs.sphere.application.model.sphere;

public class Sphere {

    private final double radius;

    private final double volume;

    private static final double PI = 3.14159;



    public Sphere (double radius){
        this.radius = radius;
        this.volume = ComputeVolume();

    }

  public double getVolume(){
        return this.volume;

 }

    public double ComputeVolume(){
        return  ((double) 4 / 3) * PI * Math.pow(radius , 3);
    }


}
