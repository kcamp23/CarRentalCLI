package com.careerdevs;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CLI {
   private static  Scanner scanner  = new Scanner(System.in);

    public static String readString (String question ) {
        while (true) {
            System.out.print(question);
            String inputString = scanner.nextLine();

            if (!inputString.trim().equals("")) {
                return inputString;
            }

            System.out.print(question);
            return scanner.nextLine();
        }
    }

public static int readInt (String question){
        while(true) {
             System.out.print(question);

             try{
                 int temp = scanner.nextInt();
                 scanner.nextLine();
                 return temp;

             }catch(InputMismatchException e){
                 System.out.print("Must enter a valid integer, please try again");
                scanner.nextLine();
                return readInt(question);
             }catch (ArrayIndexOutOfBoundsException e){
                 System.out.print("Must enter a valid selection, please try again");
                 scanner.nextLine();
                 return readInt(question);
             }


        }

}


}
