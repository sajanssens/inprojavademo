package org.example;

import java.util.Scanner;

public class HelloWorld {

    void print() {
        System.out.println("Hello world!");
        Scanner input = new Scanner(System.in);
        String text1 = input.nextLine();
        String text2 = input.nextLine();
        String text3 = input.nextLine();
        String text4 = input.nextLine();
        System.out.println("Klaar " + text1);
    }
}
