/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantapplication;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Driver {
    static void Driver(){
     
        Scanner myKb = new Scanner(System.in);

        String answer;
        String name;

        System.out.println("----------- Driver ----------- \n");

        do {

           
            System.out.printf("Enter how many €5 deliveries the driver has done: ");
            int delivery5 = myKb.nextInt();

            System.out.printf("Enter how many €10 deliveries the driver has done: ");
            int delivery10 = myKb.nextInt();

            int total5 = delivery5 * 5;
            int total10 = delivery10 * 10;

            int total = total5 + total10;

            System.out.println("The total paid to the driver is: €" + total);

            System.out.println("Do you want to repeat to another driver? Please type 'yes' or 'no'");
            answer = myKb.next();

        } while (answer.equals("yes"));

        if (answer.equals("no")) {
            System.out.println("Ok, thanks.");
        }

    }
}
