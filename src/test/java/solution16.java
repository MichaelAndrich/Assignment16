/*
 *  UCF COP3330 Fall 2021 Assignment 16 Solution
 *  Copyright 2021 Michael Andrich
 */
/*
    prompt user for their age
    determine if it is too low, then display they cannot legally drive
    determine if it is high enough, then they can legally drive
    display using a ternary operator in one output statement


 */


import java.util.Scanner;

public class solution16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("What is your age? ");
        int age = sc.nextInt();

        String result = (age>=16) ? "You are old enough to drive." :"You are not old enough to legally drive.";
                System.out.println(result);

    }
}