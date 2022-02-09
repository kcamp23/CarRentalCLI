package com.careerdevs;

import java.util.ArrayList;
import java.util.Scanner;

// change numbering system to be in order regardless of what the options are
// add time to rent
// possibly add rates and total





public class RentalService {

        public static void main(String[] args) {

            Car car1 = new Car("Ford", "Mustang", true);
            Car car2 = new Car("Pontiac", "Torrent", false);
            Car car3 = new Car("Dodge", "Ram", true);
            Car car4 = new Car("Nissan", "Stanza", false);

            ArrayList<Car> garage = new ArrayList<>();
            garage.add(car1);
            garage.add(car2);
            garage.add(car3);
            garage.add(car4);

            System.out.println("Welcome to Off the Walls  Rental CLI\n\r");

                 mainMenu(garage);

    }

            public static void mainMenu (ArrayList<Car> garage ) {
        System.out.print("MAIN MENU\n");

        int returnAvailable = 0;
        int rentalAvailable = 0;
        for (int i = 0; i < garage.size(); i++) {
            if (garage.get(i).isRented() == true) {
                rentalAvailable = rentalAvailable + 1;
            } else if (garage.get(i).isRented() == false) {
                returnAvailable = returnAvailable + 1;
            }
        }

            if  (rentalAvailable > 0) {
                System.out.print("1) Rent(" + rentalAvailable + " cars available) \n\r");
            }
            if (returnAvailable > 0) {
                System.out.print("2) Return (" + returnAvailable + " cars available) \n\r");
            }
            System.out.print("3) Exit program\n\r   ");
            System.out.print("4) Create a new car\n");


        int mainMenuOption = CLI.readInt("What would you like to do today?\n",1,4);
            if (mainMenuOption == 1) {
                //run rental menu
                rentACar(garage);
            } else if (mainMenuOption == 2) {
                //// run return menu
                returnACar(garage);
            } else if (mainMenuOption == 3) {
                endProgram();
            }else if (mainMenuOption == 4){
                createANewCar(garage);
            } else {
                System.out.print("Car selection invalid, please try again\n");
                mainMenu(garage);
            }



    }

             public static void endProgram() {
       System.out.print("Thank you for Choosing Off the Walls and have a great day!!");

    }

             public static void rentACar(ArrayList<Car> garage) {

                for (int i = 0; i < garage.size(); i++) {
                    if (garage.get(i).isRented()) {

                        System.out.print((i + 1) + ")  " + garage.get(i).getName() + "\n");
                    } else {
                        }

                }
                 int rentalOption  = CLI.readInt( "Which car would you like to rent?",1,4);

                String rentersName = CLI.readString("What name would you like to rent this under?");
                System.out.print(rentersName + " has rented the  " + garage.get((rentalOption - 1)).getName());
                //confirm they want selection
                boolean confirm = CLI.yesOrNo("Are you sure this is what you would like to rent today? \n");
                if ( confirm == true){
                    System.out.print(" Thank you " + rentersName + " you have confirmed your rental of the " + garage.get((rentalOption-1)).getName() + " we hope you enjoy your car.");

                }else {
                    System.out.print("We are sorry about that, please choose what you would like to do today. ");
                    mainMenu(garage);
                }



                        changeAvailability(garage,rentalOption);
                        whatsNext(garage);
    }

             public static void whatsNext(ArrayList<Car> garage) {
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


             public static void returnACar(ArrayList<Car> garage) {

        for (int i = 0; i < garage.size(); i++) {
            if (!garage.get(i).isRented()) {

                System.out.print((i + 1) + ")  " + garage.get(i).getName() + "\n");
            } else {
                // System.out.print((i + 1) + " ) " + "Unavailable \n");
            }
        }
            int rentalOption = CLI.readInt("Which car would you like to return?\n",1,5);
        //capture users name
        String returnersName = CLI.readString("Whose name is this being returned in today?\n");

        System.out.print(returnersName +"  has returned the  " + garage.get((rentalOption - 1)).getName() + "\n");

        boolean confirmReturn = CLI.yesOrNo("Are you sure this is what you would like to return today? \n");
        if ( confirmReturn == true){
            System.out.print(" Thank you " + returnersName + " you have confirmed your rental of the " + garage.get((rentalOption-1)).getName() + " we hope you enjoy your car.");

        }else {
            System.out.print("We are sorry about that, please choose what you would like to do today. ");
            mainMenu(garage);
        }

        changeAvailability(garage, rentalOption);
        whatsNext(garage);
    }



             public static void changeAvailability (ArrayList<Car> garage,int rentalOption){


                if (!garage.get((rentalOption - 1)).isRented()) {
                    garage.get((rentalOption - 1)).setRented(true);
                } else if (garage.get((rentalOption - 1)).isRented()) {
                    garage.get((rentalOption - 1)).setRented(false);
                }
                //garage[(rentalOption - 1)].isRented() = !garage[(rentalOption-1)].setRented();

            }

             public static void createANewCar( ArrayList<Car> garage){

                    String createMake =  CLI.readString("what will be the make of the newly added car?");
                    String createModel = CLI.readString("What will be the model of the newly added car?\n");
                    System.out.print("Thank you, your car has been created\n");

                   // Car car6 = new Car(createMake,createModel,true);
                    Car car5 = new Car(createMake,createModel,false);
                    garage.add(car5);

                    mainMenu(garage);

                        }

        }


