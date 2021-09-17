/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Max Llanes
 */

import java.util.Scanner;


public class Solution07 {


    public static void main(String[] args) {
        final double FEET_TO_METERS = 0.09290304;
        int xUserVar, yUserVar, sqFeet;
        double sqMeters;
        Scanner input = new Scanner(System.in);

        System.out.print("What is the length of the room in feet? ");
        xUserVar = input.nextInt();
        System.out.print("What is the width of the room in feet? ");
        yUserVar = input.nextInt();
        System.out.println("You entered dimensions of "+ xUserVar + " feet by " + yUserVar + " feet.");
        System.out.println("The area is");

        sqFeet = xUserVar * yUserVar;
        sqMeters = sqFeet * FEET_TO_METERS;
        System.out.println(sqFeet + " square feet");
        System.out.println(String.format("%.3f",sqMeters) + " square meters");
    }
}
