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
public class justEatNotPaid {
    static void justEatNotPaid(){
        
        Scanner myKb = new Scanner(System.in);
        double justEatNotPaid[];
        double sum1 = 0;
        System.out.println("----------- Just Eat Not Paid ----------- \n");

        System.out.print("How many Just eat not paid you want to enter: ");
        int n1 = 0;
        if (myKb.hasNextDouble()) {
            n1 = myKb.nextInt();
        }
        justEatNotPaid = new double[n1];
        for (int i = 0; i < n1; i++) {
            System.out.printf("Enter Just eat not paid  %d: €", i + 1);
            if (myKb.hasNextDouble()) {
                justEatNotPaid[i] = myKb.nextDouble();
            }
        }
        System.out.println(Arrays.toString(justEatNotPaid));

        for (double num2 : justEatNotPaid) {
            sum1 = sum1 + num2;

        }
        System.out.println("Sum of all Just eat not paid is: €" + sum1);

    }
}
