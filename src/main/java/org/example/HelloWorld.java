package org.example;

import java.util.Scanner;

public class HelloWorld {

    void wieBenIk() {
        System.out.println("Hello world!");
        Scanner input = new Scanner(System.in);

        String text1; // 1) declareren
        text1 = input.nextLine(); // 2a) gebruiken: write
        String output = "Klaar " + text1; // 2b) gebruiken: read

        System.out.println(output);
    }
}
