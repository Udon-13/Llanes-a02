/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Max Llanes
 */

import java.util.Scanner;

public class Solution10 {
    /*
        get 3 inputs from user
        store in price array
        get 3 inputs from user
        store in quantity array
        add all prices to subtotal
        take 5.5% of total as tax
        output total w/ tax
     */
    public static void main(String[] args) {
        final int MAX_AMOUNT =3;
        double RATE_TAX = 0.055;
        Scanner input = new Scanner(System.in);
        double prices[] = new double [MAX_AMOUNT], subtotal =0, tax=0, total=0;
        int quantity[] = new int[MAX_AMOUNT];

        for(int i=0; i<MAX_AMOUNT; i++)
        {
            System.out.print("Enter the price of item " + (i+1) + ": ");
            prices[i] = input.nextDouble();
            System.out.print("Enter the quantity of the item " + (i+1) + ": ");
            quantity[i] = input.nextInt();
            subtotal += prices[i] * quantity[i];
        }
        tax =subtotal * RATE_TAX;
        total = tax + subtotal;

        System.out.println("Subtotal: $" + String.format("%.2f", subtotal));
        System.out.println("Tax: $" + String.format("%.2f", tax));
        System.out.println("Total: $" + String.format("%.2f", total));




    }
}
