/*
 *  UCF COP3330 Fall 2021 Assignment 9 Solution
 *  Copyright 2021 Max Llanes
 */

import java.util.Scanner;

public class Solution09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int PAINT_TOTAL = 350;
        int xInput, yInput, area, paintNeeded;
        System.out.println("What is the length of the ceiling?");
        xInput = input.nextInt();
        System.out.println("What is the width of the ceiling?");
        yInput = input.nextInt();
        area = xInput * yInput;
        if((area%PAINT_TOTAL)!=0)
        {
            paintNeeded = area/PAINT_TOTAL;
            paintNeeded += 1;
        }
        else{
            paintNeeded = area/PAINT_TOTAL;
        }
        System.out.println("You will need to purchase " + paintNeeded + " gallons of paint to cover " + area+ " square feet.");
    }
}
