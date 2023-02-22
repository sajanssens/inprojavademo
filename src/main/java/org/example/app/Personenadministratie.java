package org.example.app;

import java.util.ArrayList;
import java.util.Scanner;

public class Personenadministratie {

    public static void main(String[] args) {

        System.out.println("Welkom bij de HR-administratie!");
        System.out.println("Geef hieronder de personen een voor een op.");
        System.out.println("Sluit af met \"stop\".");

        Scanner scanner = new Scanner(System.in);
        ArrayList<Persoon> personen = new ArrayList<>(); // type inference

        while (true) {
            System.out.print("Naam: ");
            String line = scanner.nextLine();
            if ("stop".equals(line)) break;
            String naam = line;

            System.out.print("Leeftijd: ");
            String line2 = scanner.nextLine();
            if ("stop".equals(line2)) break;
            int leeftijd = Integer.parseInt(line2);

            Persoon p = new Persoon(naam, leeftijd);

            personen.add(p);
        }

        int totaalLeeftijd = 0;
        for (Persoon persoon : personen) {
            totaalLeeftijd += persoon.getLeeftijd();
        }

        System.out.println("Gemiddelde leeftijd is: " + totaalLeeftijd / personen.size());
        System.out.println("Bye bye!");
    }

    private static String getLine(Scanner scanner) {
        String line = scanner.nextLine();
        if ("stop".equals(line)) return null;
        return line;
    }

    private static void arrayvariant() {
        Scanner scanner = new Scanner(System.in);

        float[] cijfers = new float[100];

        String input = "";
        int aantal = 0;

        do {
            System.out.print("Cijfer: ");
            input = scanner.nextLine();
            if (input.equals("stop")) break;

            cijfers[aantal] = Float.parseFloat(input);
            aantal++;
        } while (aantal < 100);

        float totaal = 0.0f;
        for (int i = 0; i < aantal; i++) {
            totaal += cijfers[i];
        }

        System.out.println("Je staat gemiddeld: " + (totaal / aantal));
    }
}
