package com.rocs.rectangle.application.model.rectangle;

public class Rectangle {

    private double height;

    private double width;

    private double area;

    private double parameter;

    public Rectangle() {

    }

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
        this.area = computeArea();
        this.parameter = computeParameter();
    }

    public double computeArea() {
        return width * height;

    }

    public double computeParameter() {
        return 2 * (height + width);
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

}


