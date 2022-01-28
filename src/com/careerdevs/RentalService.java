package com.careerdevs;

import java.util.Scanner;

public class RentalService {
    public static void main(String[] args) {
            mainMenu();
            endProgram();

        System.out.println("Welcome to the Car Rental CLI\n\r");
    }

    public static void mainMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Are you renting or returning today?\n\r");
        System.out.print("1) Rent\n\r");
        System.out.print("2) Return \n\r");
        System.out.print("3) Exit program\n\r ");

        int mainMenuOption = scanner.nextInt();
        //entr CLI class once its been laid out

        if (mainMenuOption == 1) {
            //run rental menu
        } else if (mainMenuOption == 2) {
            //// run return menu
        }
    }

            public static void endProgram () {
                System.out.print("Thank you for Choosing Off the Walls and have a great day!!");
            }
        public static void rentACar ();

    }
}

