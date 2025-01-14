package com.rocs.rectangle.application;

import com.rocs.rectangle.application.model.rectangle.Rectangle;

import java.util.Scanner;

public class rectangleApplication {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Height: ");
        double height = sc.nextDouble();

        System.out.println("Enter Width: ");
        double width = sc.nextDouble();

        Rectangle myRect = new Rectangle(height, width);

        System.out.println("The Area of the Rectangle is " + myRect.computeArea());
        System.out.println("The Parameter of the Rectangle is " + myRect.computeParameter());
    }

}

