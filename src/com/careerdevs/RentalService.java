package com.careerdevs;

import java.util.Scanner;

public class RentalService {
    public static void main(String[] args) {

        Car[] garage = new Car[4];
        Car car1 = new Car("Ford", "Mustang", true);
        Car car2 = new Car("Pontiac", "Torrent", true);
        Car car3 = new Car("Dodge", "Ram", true);
        Car car4 = new Car("Nissan", "Stanza", true);
        garage[0] = car1;
        garage[1] = car2;
        garage[2] = car3;
        garage[3] = car4;

        System.out.println("Welcome to Off the Walls  Rental CLI\n\r");
        mainMenu(garage);

    }

    public static void mainMenu(Car[] garage) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Are you renting or returning today?\n\r");
        System.out.print("1) Rent\n\r");
        System.out.print("2) Return \n\r");
        System.out.print("3) Exit program\n\r  Which option: ");


        int mainMenuOption = scanner.nextInt();
        //entr CLI class once its been laid out

        if (mainMenuOption == 1) {
            //run rental menu
            rentACar(garage);
        } else if (mainMenuOption == 2) {
            //// run return menu
            returnACar(garage);
        } else if (mainMenuOption == 3) {
            endProgram();
        } else {
            System.out.print("Car selection invalid, please try again\n");
            mainMenu(garage);
        }


    }

    public static void endProgram() {
        System.out.print("Thank you for Choosing Off the Walls and have a great day!!");

    }

    public static void rentACar(Car[] garage) {
        System.out.print("Which car would you like to rent today?\n");

        for (int i = 0; i < garage.length; i++) {
            if (garage[i].isRented() == true) {

                System.out.print((i + 1) + ")  " + garage[i].getName() + "\n");
            } else {
                // System.out.print((i + 1) + " ) " + "Unavailable \n");
            }

        }
       changeAvailability(garage);
        whatsNext(garage);

//        System.out.print("The following cars are now available: \n");
//        for (int i = 0; i < garage.length; i++) {
//            if (garage[i].isRented() == true) {
//
//                System.out.print((i + 1) + ")  " + garage[i].getName() + "\n");
//            } else {
//                 System.out.print((i + 1) + " ) " + "Unavailable \n");
//            }

    }

    public static void whatsNext(Car[] garage) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What would you like to do next?");
        System.out.println("1) Rent another car?");
        System.out.println("2) Return a car");
        System.out.println("3) Return to main menu");
        int rentalNext = scanner.nextInt();

        switch (rentalNext) {
            case 1:
                rentACar(garage);
                break;

            case 2:
                returnACar(garage);
                break;

            case 3:
                mainMenu(garage);
                break;

            default:
                mainMenu(garage);
                break;


        }
    }


    public static void returnACar(Car[] garage) {

        System.out.print("Available cars to rent today?\n");

        for (int i = 0; i < garage.length; i++) {
                if (garage[i].isRented() == false) {

                    System.out.print((i + 1) + ")  " + garage[i].getName() + "\n");
                } else {
                    // System.out.print((i + 1) + " ) " + "Unavailable \n");
                    }
                    }
        changeAvailability(garage);
        whatsNext(garage);
    }


        public static void changeAvailability(Car[] garage ){
            System.out.println("Which car  would you like to choose?");
            Scanner scanner = new Scanner(System.in);
            int rentalOption = scanner.nextInt();
            System.out.print(" You have choosen the  " + garage[(rentalOption - 1)].getName() + "\n");

            if (!garage[(rentalOption - 1)].isRented()) {
                garage[(rentalOption - 1)].setRented(true);
            } else if (garage[(rentalOption - 1)].isRented() == true) {
                garage[(rentalOption - 1)].setRented(false);
            }
            //garage[(rentalOption - 1)].isRented() = !garage[(rentalOption-1)].setRented();

        }
    }



