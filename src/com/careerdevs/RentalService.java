package com.careerdevs;

import java.util.Scanner;

public class RentalService {
    public static void main(String[] args) {
        rentalCheckIn();
    }

        public static void rentalCheckIn() {

            System.out.print("Welcome to the Car Rental CLI");

            Scanner scanner = new Scanner(System.in);

            System.out.print("Would you like to rent or return today? \n Rent or Return: ");
            String rentOrReturn = scanner.next();

            if (rentOrReturn == "return") {
                returnMethod();
            } else if (rentOrReturn != "return") {
                rentMethod();
            }
            System.out.print("Thank you for choosing us we hope you enjoyed your experience and we hope to see you again soon");
        }

        //goes into the garage
    public static  void rentMethod(){
        System.out.print("Which Option would you like today");


    }

    public static void returnMethod(){

    }
}
