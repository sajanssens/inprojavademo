package org.example.app;

import java.util.ArrayList;
import java.util.Scanner;

public class Cijferadministratie {

    public static void main(String[] args) {

        System.out.println("Welkom bij de Cijferadministratie!");
        System.out.println("Geef hieronder de cijfers een voor een op, maximaal 100.");
        System.out.println("Sluit af met \"stop\".");

        // arrayvariant();

        Scanner scanner = new Scanner(System.in);
        ArrayList<Float> cijfers = new ArrayList</*Float*/>(); // type inference
        // generics = "generic types"

        while (true) {
            String line = scanner.nextLine();
            if ("stop".equals(line)) break;

            float cijfer = Float.parseFloat(line);
            cijfers.add(cijfer);
        }

        float som = 0;
        for (Float cijfer : cijfers) {
            som += cijfer;
        }
        float gemiddelde = som / cijfers.size();

        // SELECT AVG(waarde)
        // FROM Cijfers
        // WHERE waarde > 5.5

        double gemidd = cijfers.stream() // FROM Cijfers
                .filter(c -> c > 5.5) // WHERE waarde > 5.5
                .mapToDouble(Float::doubleValue).average() // SELECT AVG(waarde)
                .orElse(0.0);

        System.out.println("Je staat gemiddeld: " + gemiddelde);
        System.out.println("Gemiddelde van de voldoendes: " + gemidd);

        System.out.println("Bye bye!");
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
