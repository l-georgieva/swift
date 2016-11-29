package task1_NumberNotANumber;

import java.util.Scanner;

/**
 * Created by ASUS on 20.11.2016 г..
 */
public class Task1_NumberNotANumber {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);


        String input;
        while (!(input = scn.nextLine()).equals("END")) {

            // if(input.equals("END")){
            //break;
            // }
            try {
                int num = Integer.parseInt(input);
                System.out.println("Number");
            } catch (NumberFormatException e) {

                System.out.println("Not a number");


            }

        }

    }
}




