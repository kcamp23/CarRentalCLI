package com.careerdevs;

import java.util.Scanner;

public class CLI {
   private static  Scanner scanner  = new Scanner(System.in);

    public static String readString (String question ){
       System.out.print(question );
        return scanner.nextLine();

    }
public static int readInt (String question){
       System.out.print(question );
       return scanner.nextInt();
}


}
