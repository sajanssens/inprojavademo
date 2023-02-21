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

        System.out.println(nieuweTijd);

        System.out.println(3 * 11 % 3);
        System.out.println((3 * 11) % 3);  //0
    }
}
