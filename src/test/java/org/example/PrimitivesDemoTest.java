package org.example;

import org.junit.jupiter.api.Test;

class PrimitivesDemoTest {

    @Test
    void aantalBenodigdeWielenPlusMinimumVoorraad() {
        int wielen = 32;
        int autos = 4;
        int minimumVoorraad = 16;
        // We verdubbelen het aantal auto's
        // In de println auto's * 2
        // Wat verwacht je?
        System.out.println((wielen - minimumVoorraad) / autos * 2);
        System.out.println(((wielen - minimumVoorraad) / autos) * 2);
        System.out.println((wielen - minimumVoorraad) / (autos * 2));
    }

    @Test
    void moduloDemo() {
        int tijd = 22;
        int uren = 5;
        int nieuweTijd = (tijd + uren) % 24; // 27 / 24 = 1 rest 3

        print(nieuweTijd);

        print(3 * 11 % 3);
        print((3 * 11) % 3);  //0
    }

    void print(int message) {
        print(message + "");
    }

    void print(String message) {
        print(message, true);
    }

    void print(String message, boolean printUitroepteken) {
        if (printUitroepteken) {
            System.out.println(message + "!");
        } else {
            System.out.println(message);
        }
    }
}
