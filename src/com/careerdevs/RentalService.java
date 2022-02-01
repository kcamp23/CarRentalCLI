package com.careerdevs;

import java.util.ArrayList;
import java.util.Scanner;

public class RentalService {
    public static void main(String[] args) {

        Car[] garage = new Car[4];
        Car car1 = new Car("Ford", "Mustang", true);
        Car car2 = new Car("Pontiac", "Torrent", false);
        Car car3 = new Car("Dodge", "Ram", true);
        Car car4 = new Car("Nissan", "Stanza", false);
        garage[0] = car1;
        garage[1] = car2;
        garage[2] = car3;
        garage[3] = car4;

        System.out.println("Welcome to Off the Walls  Rental CLI\n\r");
        mainMenu(garage);

    }

    public static void mainMenu(Car[] garage) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("MAIN MENU");

        System.out.print("What  would you like to do today?\n\r");

        int returnAvailable = 0;
        int rentalAvailable = 0;
        for (int i = 0; i < garage.length; i++) {
            if (garage[i].isRented() == true) {
                rentalAvailable = rentalAvailable + 1;
            } else if (garage[i].isRented() == false) {
                returnAvailable = returnAvailable + 1;
            }
        }
            //incrment with true statements
            //if gretaer than 0 then print option
            // print number of options

            if  (rentalAvailable > 0) {
                System.out.print("1) Rent(" + rentalAvailable + " cars available) \n\r");
            }
            if (returnAvailable > 0) {
                System.out.print("2) Return (" + returnAvailable + " cars available) \n\r");
            }
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
            if (garage[i].isRented()) {

                System.out.print((i + 1) + ")  " + garage[i].getName() + "\n");
            } else {
                // System.out.print((i + 1) + " ) " + "Unavailable \n");
            }

        }
        System.out.println("Which car  would you like to choose?");
        Scanner scanner = new Scanner(System.in);
        int rentalOption = scanner.nextInt();
        //capture users name
        System.out.print("What name would you like to rent this under?");
        String rentersName = scanner.next();
        System.out.print(rentersName + " have rented the  " + garage[(rentalOption - 1)].getName() + "\n");
        //confirm they want selection

        changeAvailability(garage, rentalOption);
        whatsNext(garage);
    }


    public static void whatsNext(Car[] garage) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What would you like to do next?");
        System.out.println("1) Rent another car?");
        System.out.println("2) Return a car");
        System.out.println("3) Return to main menu");
        int rentalNext = scanner.nextInt();

        switch (rentalNext) {
            case 1 -> rentACar(garage);
            case 2 -> returnACar(garage);
            case 3 -> mainMenu(garage);
            default -> mainMenu(garage);
        }
    }


    public static void returnACar(Car[] garage) {

        System.out.print("Available cars to rent today?\n");

        for (int i = 0; i < garage.length; i++) {
            if (!garage[i].isRented()) {

                System.out.print((i + 1) + ")  " + garage[i].getName() + "\n");
            } else {
                // System.out.print((i + 1) + " ) " + "Unavailable \n");
            }
        }

        System.out.println("Which car  would you like to choose?");
        Scanner scanner = new Scanner(System.in);
        int rentalOption = scanner.nextInt();
        //capture users name
        System.out.print("Whose name is this being returned in? ");
        String returnersName = scanner.next();
        System.out.print(returnersName +"  have returned the  " + garage[(rentalOption - 1)].getName() + "\n");
        //confirm they want selection
        changeAvailability(garage, rentalOption);
        whatsNext(garage);
    }



            public static void changeAvailability (Car[]garage,int rentalOption){


                if (!garage[(rentalOption - 1)].isRented()) {
                    garage[(rentalOption - 1)].setRented(true);
                } else if (garage[(rentalOption - 1)].isRented()) {
                    garage[(rentalOption - 1)].setRented(false);
                }
                //garage[(rentalOption - 1)].isRented() = !garage[(rentalOption-1)].setRented();

            }
        }


