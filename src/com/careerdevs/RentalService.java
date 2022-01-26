package com.careerdevs;

import java.util.Scanner;

public class RentalService {
    public static void main(String[] args) {
        System.out.print("Welcome to the Car Rental CLI");

       rentalCheckIn();
        rentMethod();
   }
//
               public static void rentalCheckIn() {

            Scanner scanner = new Scanner(System.in);

            System.out.print("\n Would you like to rent or return today? \n Rent or Return: ");
            String rentOrReturn = scanner.next();
        }

//            if (rentOrReturn != "rent") {
//                //System.out.print("which option would you like today? \n " );
//
//
//
//
//
//
//
//
//            } else if (rentOrReturn == "rent") {
//                rentMethod();
//            }
            //System.out.print("Thank you for choosing us we hope you enjoyed your experience and we hope to see you again soon");


        //goes into the garage
    public static void  rentMethod() {
        // System.out.print("Which Option would you like today" + "\n");

        Car[] garage = new Car[4];
        Car car1 = new Car("Ford", "Mustang", false);
        Car car2 = new Car("Pontiac", "Torrent", false);
        Car car3 = new Car("Dodge", "Ram", true);
        Car car4 = new Car("Nissan", "Stanza", true);

        garage[0] = car1;
        garage[1] = car2;
        garage[2] = car3;
        garage[3] = car4;

        for (int i = 0; i < garage.length; i++) {
            if(garage[i].isRented() == true ) {

                System.out.print((i + 1) + ")  " + garage[i].getName() + "\n");
            }
            else {
                System.out.print((i+1) + " ) " +"Unavailable \n");
            }
                // System.out.println(garage[0]);
        }
    }








//    public static void returnMethod(){
//
//    }
//
}
