package com.careerdevs;

import java.util.Scanner;

import static java.util.Scanner.*;

public class RentalService {
    public static void main(String[] args) {
        System.out.println("Welcome to Off the Walls  Rental CLI\n\r");
        mainMenu();
        endProgram();
    }

    public static void mainMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Are you renting or returning today?\n\r");
        System.out.print("1) Rent\n\r");
        System.out.print("2) Return \n\r");
        System.out.print("3) Exit program\n\r  Which option: ");


        int mainMenuOption = scanner.nextInt();
        //entr CLI class once its been laid out

        if (mainMenuOption == 1) {
            //run rental menu
            rentACar();
        } else if (mainMenuOption == 2) {
            //// run return menu
        }
    }

    public static void endProgram() {
        System.out.print("Thank you for Choosing Off the Walls and have a great day!!");
    }

    public static void rentACar() {
        System.out.print("Which car would you like to rent today?\n");
        availableCars();


    }

    public static void availableCars() {

        Car[] garage = new Car[4];
        Car car1 = new Car("Ford", "Mustang", true);
        Car car2 = new Car("Pontiac", "Torrent", true);
        Car car3 = new Car("Dodge", "Ram", true);
        Car car4 = new Car("Nissan", "Stanza", true);

        garage[0] = car1;
        garage[1] = car2;
        garage[2] = car3;
        garage[3] = car4;


        for (int i = 0; i < garage.length; i++) {
            if (garage[i].isRented() == true) {

                System.out.print((i + 1) + ")  " + garage[i].getName() + "\n");
            } else {
                // System.out.print((i + 1) + " ) " + "Unavailable \n");
            }

        }
        System.out.println("Which option would you like?");
        Scanner scanner = new Scanner(System.in);
        int rentalOption = scanner.nextInt();
        System.out.print(" You have choosen the  " + garage[(rentalOption - 1)].getName() + "\n");

        garage[(rentalOption - 1)].setRented(false);

        System.out.print("The following cars are now available: \n");
        for (int i = 0; i < garage.length; i++) {
            if (garage[i].isRented() == true) {

                System.out.print((i + 1) + ")  " + garage[i].getName() + "\n");
            } else {
                // System.out.print((i + 1) + " ) " + "Unavailable \n");
            }
            System.out.println("What would you like to do next?");
            System.out.println("1) Rent another car?");
            System.out.print("2) Return a car");
            System.out.println("Return to main menu");
            int rentalNext = scanner.nextInt();

            switch (rentalNext) {
                case 1:
                    rentACar();
                    break;

                case 2:
                    //returnaCar();
                    break;

                case 3:
                    mainMenu();


            }
        }


    }


    public static void returnACAr(){


        System.out.print("What car are you returning today? \n");
    }
}


