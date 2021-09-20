/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Max Llanes
 */

import java.util.Scanner;

public class Solution15 {
    /*
        get username
        get password
        compare password to preset password
        if password = userPassword
            true - output welcome
        else
            who dis?
     */
    public static void main(String[] args) {
        String username, password;
        final String setPassword = "abc$123";
        Scanner input = new Scanner(System.in);

        System.out.println("What is your username? ");
        username = input.next();
        System.out.println("What is the password? ");
        password = input.next();

        if(password.equals(setPassword))
        {
            System.out.println("Welcome, " + username + "!");
        }
        else
        {
            System.out.println("I don't know you.");
        }

    }
}
