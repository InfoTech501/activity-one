package com.rocs.rectangle.application;

import com.rocs.rectangle.application.model.rectangle.Rectangle;

import java.util.Scanner;

public class RectangleApplication {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double height = 0;
        double width = 0;

        System.out.println("Enter height: ");
        height = sc.nextDouble();

        System.out.println("Enter width: ");
        width = sc.nextDouble();

        Rectangle myRectangle = new Rectangle(width, height);

        System.out.printf("The Perimeter of the Rectangle is " + myRectangle.getPerimeter());
        System.out.printf("The Area of the Rectangle is " + myRectangle.getArea());

    }
}
