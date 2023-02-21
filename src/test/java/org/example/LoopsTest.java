package org.example;

import org.junit.jupiter.api.Test;

public class LoopsTest {

    @Test
    void whileDemo() {
        int i = 0;

        while (i < 10) {
            System.out.println(i);
            i++;
        }
    }

    @Test
    void forDemo() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }

    @Test
    void coordinaten() {
        int max = 50;

        for (int y = max; y >= 0; y--) {
            System.out.print("| ");
            for (int x = 0; x <= max; x++) {
                String xFormatted = String.format("%1$2s", x);
                String yFormatted = String.format("%1$2s", y);
                System.out.print("(" + xFormatted + ", " + yFormatted + ") ");
            }
            System.out.println();
        }
        System.out.println("O -----------------------------------------------------------------------------------------------------------------------------");

    }
}
