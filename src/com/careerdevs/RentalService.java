package com.careerdevs;

import java.util.Scanner;

public class RentalService {
    public static void main(String[] args) {
        System.out.print("Welcome to the Car Rental CLI");
        rentalCheckIn();
    }

        public static void rentalCheckIn() {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Would you like to rent or return today? \n Rent or Return: ");
            String rentOrReturn = scanner.next();

            if (rentOrReturn == "rent") {
                System.out.print("which option would you like today? \n " );








            } else if (rentOrReturn != "return") {
                rentMethod();
            }
            //System.out.print("Thank you for choosing us we hope you enjoyed your experience and we hope to see you again soon");
        }

        //goes into the garage
    public static  void rentMethod() {
        System.out.print("Which Option would you like today" + "\n");

        Car car1 = new Car("Ford","Mustang",false);
        Car car2 = new Car("Pontiac", "Torrent", false);
        Car car3 = new Car("Dodge", "Ram", true);
        Car car4 = new Car("Nissan", "Stanza", true);

        System.out.print( car1);





    }

    public static void returnMethod(){

    }

}
