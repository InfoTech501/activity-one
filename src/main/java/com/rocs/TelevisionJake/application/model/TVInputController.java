// Jake Viado
package com.rocs.TelevisionJake.application.model;

import java.util.Scanner;

public class TVInputController {
    Scanner sc = new Scanner(System.in);
    
    Television tv = new Television();

    int station;
    boolean programRunning = true;

    public void runProgram() {
        while (programRunning) {
            System.out.println("Remote ng tv");
            System.out.println("Press 'P' to turn on tv");
            String choice = sc.nextLine();

            if (choice.equals("P")) {
                if (!tv.isPowered()) {
                    turnOn();
                }
            }
        } sc.close();
    }

    public void turnOn() {
        tv.setpower();
        System.out.println("Power on");
        System.out.println("Current chanel:" + tv.getChannel());

        while (tv.isPowered()) {
            System.out.println("1. Select channel");
            System.out.println("2. Adjust volume");
            System.out.println("3. Turn off");
            System.out.print("Press button:");

            String option = sc.nextLine();

            switch (option) {
                case "1":
                    selectChannel();
                    break;
                case "2":
                    adjustVolume();
                    break;
                case "3":
                    turnOff();
                    break;
            }
        }
    }

    public void selectChannel() {
        System.out.print("Select channel:  ");
        station = sc.nextInt();
        sc.nextLine();
        tv.setChannel(station);
        System.out.println("Channel:" + station);
    }

    public void adjustVolume() {
        System.out.println("Adjust volume:" + tv.getVolume());
        System.out.println("Press buttons: " + " + & - ");

        String option = sc.nextLine();
        switch (option) {
            case "+":
                increaseVolume();
                break;
            case "-":
                decreaseVolume();
                break;
        }
    }

    public void turnOff() {
        tv.setpower();
        System.out.println("Power op");
    }

    public void increaseVolume() {
        tv.increaseVolume();
        System.out.println("Volume: " + tv.getVolume());
    }

    public void decreaseVolume() {
        tv.decreaseVolume();
        System.out.println("Volume: " + tv.getVolume());
    }
}
