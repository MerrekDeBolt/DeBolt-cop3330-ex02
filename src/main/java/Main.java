/*
 *  UCF COP3330 Fall 2021 Exercise 2 Solution
 *  Copyright 2021 Merrek DeBolt
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the input string? ");
        String input = scanner.nextLine();
        System.out.println(input + " has " + input.length() + " characters.");
    }
}