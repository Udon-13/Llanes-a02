/*
 *  UCF COP3330 Fall 2021 Assignment # Solution
 *  Copyright 2021 Max Llanes
 */

import java.util.Scanner;

public class Solution22 {
    /*
        get 3 nums
        use temp to hold biggest num
        go through all
        check temp < num
        out largest num
     */
    public static void main(String[] args) {
        int num1, num2, num3, temp;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number:");
        num1 = input.nextInt();
        System.out.print("Enter the second number:");
        num2 = input.nextInt();
        System.out.print("Enter the third number:");
        num3 = input.nextInt();

        if(num1 == num2 || num1 == num3)
        {
            System.out.println("Do not input the same number");
            System.exit(0);
        }
        else if(num2 == num3)
        {
            System.out.println("Do not input the same number");
            System.exit(0);
        }

        temp = num1;
        if(temp<num2)
        {
            temp = num2;
        }
        else if(temp<num3)
        {
            temp = num3;
        }

        System.out.println("The largest number is " + temp + ".");
    }
}
