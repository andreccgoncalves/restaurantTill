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

public class justEatPaid{
    static void justEatPaid(){
        
        Scanner myKb = new Scanner(System.in);
        double justEatPaid[];
        double sum = 0;
        System.out.println("----------- Welcome to the Till app ----------- \n");

        System.out.print("How many Just eat paid you want to enter: ");
        int n = 0;
        if (myKb.hasNextDouble()) {
            n = myKb.nextInt();
        }
        justEatPaid = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Enter Just eat paid %d: €", i + 1);
            if (myKb.hasNextDouble()) {
                justEatPaid[i] = myKb.nextDouble();
            }
        }
        System.out.println(Arrays.toString(justEatPaid));

        for (double num1 : justEatPaid) {
            sum = sum + num1;

        }
        System.out.println("Sum of all Just eat paid is: €" + sum);

    }

}
