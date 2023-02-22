package org.example.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersoonTest {

    @Test
    void createPersoon() {
        Persoon b = new Persoon("Bram", 43);
        // b.setNaam("Bram");
        // b.setLeeftijd(143);

        // Persoon a = new Persoon();
        // a.naam = "Angelique";
        // a.leeftijd = 34;
        //
        // Persoon e = new Persoon();
        // e.naam = "Erwin";
        // e.leeftijd = 52;
    }
}
