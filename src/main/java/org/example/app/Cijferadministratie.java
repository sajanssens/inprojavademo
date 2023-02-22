package org.example.app;

import java.util.Scanner;

public class Cijferadministratie {

    public static void main(String[] args) {

        System.out.println("Welkom bij de Cijferadministratie!");
        System.out.println("Geef hieronder de cijfers een voor een op, maximaal 100.");
        System.out.println("Sluit af met \"stop\".");

        Scanner scanner = new Scanner(System.in);
        float[] cijfers = new float[100];

        String input = "";
        int aantal = 0;
        System.out.print("Cijfer: ");

        while (!(input = scanner.nextLine()).equals("stop") && aantal < 100) {
            System.out.print("Cijfer: ");
            cijfers[aantal] = Float.parseFloat(input);
            aantal++;
        }

        float totaal = 0.0f;
        for (int i = 0; i < aantal; i++) {
            totaal += cijfers[i];
        }

        System.out.println("Je staat gemiddeld: " + (totaal / aantal));

        System.out.println("Bye bye!");
    }
}
