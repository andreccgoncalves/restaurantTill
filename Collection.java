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
public class Collection {
    static void Collection(){
        
        Scanner myKb = new Scanner(System.in);
        double collection[];
        double sum2 = 0;
        System.out.println("----------- Collection ----------- \n");
        System.out.print("How many collection you want to enter: ");

        int n2 = 0;
        if (myKb.hasNextDouble()) {
            n2 = myKb.nextInt();
        }

        collection = new double[n2];
        for (int i = 0; i < n2; i++) {
            System.out.printf("Enter all collections  %d: €", i + 1);
            if (myKb.hasNextDouble()) {
                collection[i] = myKb.nextDouble();
            }
        }
        System.out.println(Arrays.toString(collection));

        for (double num3 : collection) {
            sum2 = sum2 + num3;

        }
        System.out.println("Sum of all collection is: €" + sum2);
    }
}
