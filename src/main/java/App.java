/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Koby Montenegro
 */

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.print("Enter a noun: ");
        Scanner scanner = new Scanner(System.in);
        String noun = scanner.nextLine();

        System.out.print("Enter a verb: ");
        String verb = scanner.nextLine();

        System.out.print("Enter an adjective: ");
        String adjective = scanner.nextLine();

        System.out.print("Enter an adverb: ");
        String adverb = scanner.nextLine();

        String output = String.format("Do you " + verb + " your " + adjective + " " + noun + " " + adverb + "? That's hillarious!");

        System.out.print(output);

        scanner.close();

    }
}
