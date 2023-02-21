package org.example;

import java.util.Random;

public class Comparisons {

    public void demo(int temperatuur, String message) {
        // comparison of reference types: use, equals, compareto, contains, ....
        if (!message.equals("")) { // message != ""
            System.out.println(message);
        }

        int lastIndex = message.length() - 1;
        char lastChar = message.charAt(lastIndex);

        if (lastChar == '!') {
            System.out.println("Niet zo schreeuwen!!!!!!");
        }

        // comparison of primitive types: use default operators like ==, <, !, ...
        if (temperatuur < 0) {
            System.out.println("Koud hè?!");
        }

        if (temperatuur == 0) {
            System.out.println("Niet warm, niet koud.");
        }

        while ((temperatuur = haalTempUitDatabase()) > 0) {
            System.out.println("Vandaag is het: " + temperatuur);
        }
    }

    private int haalTempUitDatabase() {
        return new Random().nextInt(100);
    }


}
