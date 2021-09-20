/*
 *  UCF COP3330 Fall 2021 Assignment # Solution
 *  Copyright 2021 Max Llanes
 */

import java.util.Scanner;

public class Solution16 {
    /*
        get age fUser
        use ternary to change variable
            if true - v=old
            else
            v = not old
        output result + v
     */
    public static void main(String[] args) {
        int age;
        String confirmation;
        Scanner input = new Scanner(System.in);

        System.out.println("What is your age? ");
        age = input.nextInt();
        confirmation = (age>=16 ? "old" : "not old");

        System.out.println("You are " + confirmation + " enough to legally drive");

    }
}
