package com.rocs.binary.application;

import com.rocs.binary.application.model.binary.Binary;

import java.util.Scanner;

public class BinaryApplication {

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

        System.out.println("Enter binary value: ");
        String binary = String.valueOf(sc.nextInt());

            Binary myBinary = new Binary(binary);

            System.out.println("Your binary input: " + binary);
            System.out.println("decimal value: " + myBinary.getDecimal());
            System.out.println("hexadecimal value: " + myBinary.getHexadecimal());
            System.out.println("octal value: " + myBinary.getOctal());

        }
    }
