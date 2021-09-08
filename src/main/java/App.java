/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jazz Faye Olario
 */

import java.util.Scanner;   //Using class scanner

public class App {
    // main method begins execution of Java application
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    //Create scanner to obtain input from user
        System.out.println("Enter a noun: ");
        String noun = sc.nextLine();    //reads the noun

        System.out.println("Enter a verb: ");
        String verb = sc.nextLine();    //reads the verb

        System.out.println("Enter an adjective: ");
        String adjective = sc.nextLine();   //reads the adjective

        System.out.println("Enter an adverb: ");
        String adverb = sc.nextLine();  //reads the adverb
        //Using string interpolation
        String output = String.format("Do you %s your %s %s %s? That's hilarious!", verb, adjective, noun, adverb);
        System.out.println(output); //displays the output
    }
}
