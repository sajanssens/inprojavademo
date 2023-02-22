package org.example.app;

import org.junit.jupiter.api.Test;

class PersoonTest {

    @Test
    void createPersoon() {
        int g = 0;
        int g2 = 0;

        if (g == g2) {
            System.out.println("Gelijk getal!");
        }

        Persoon b = new Persoon("Bram", 43);
        Persoon b2 = new Persoon("Bram", 43);
        // b.setNaam("Bram");
        // b.setLeeftijd(143);
        System.out.println(b.toString() + "!");

        if (b.equals(b2)) {
            System.out.println("Gelijk persoon!");
        }

        // Persoon a = new Persoon();
        // a.naam = "Angelique";
        // a.leeftijd = 34;
        //
        // Persoon e = new Persoon();
        // e.naam = "Erwin";
        // e.leeftijd = 52;
    }
}
