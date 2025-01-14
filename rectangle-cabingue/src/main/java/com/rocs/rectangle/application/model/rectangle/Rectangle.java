package com.rocs.rectangle.application.model.rectangle;

public class Rectangle {
    private double width;

    private double height;

    private double area;

    private double perimeter;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
        this.area = computeArea();
        this.perimeter =computePerimeter();
    }

    public double getArea(){
        return this.area;
    }

    public double getPerimeter(){
        return this.perimeter;
    }

    private double computeArea() {
        return width * height;
    }

    private double computePerimeter() {
        return 2 * (width + height);
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

}
