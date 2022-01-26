package com.careerdevs.justassignment;

public class AssignmentRental {


        AssignmentCar[] garage = new AssignmentCar[4];
        AssignmentCar car1 = new AssignmentCar("Ford", "Mustang", false);
        AssignmentCar car2 = new AssignmentCar("Pontiac", "Torrent", false);
        AssignmentCar car3 = new AssignmentCar("Dodge", "Ram", true);
        AssignmentCar car4 = new AssignmentCar("Nissan", "Stanza", true);

        garage[0] = car1;
        garage[1] = car2;
        garage[2] = car3;
        garage[3] = car4;


            for (int i = 0; i < garage.length; i++) {
            if (garage[i].isRented() == true) {

            System.out.print((i + 1) + ")  " + garage[i].getName() + "\n");
            } else {
                System.out.print((i + 1) + " ) " + "Unavailable \n");
            }

            }

public static void userSelectionRent() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to select the car you 'd like to rent \n Selection:");
        int userChoiceRent = scanner.nextInt();
//choose car, move car to rented , print confirmation information

        }
