package org.example;

import java.util.Scanner;

public class HelloWorld {

    void print() {
        System.out.println("Hello world!");
        Scanner input = new Scanner(System.in);
        String text1 = input.nextLine();
        System.out.println("Klaar " + text1);
    }
}
