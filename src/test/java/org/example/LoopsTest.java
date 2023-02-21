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
}
