package org.example;

import java.io.IOException;
import java.util.Random;

public class Comparisons {

    // instance members: ------------------------
    //   properties (a.k.a. fields, attributes (in UML)):
    String mijnNaam;
    int mijnLeeftijd;

    //   methods (a.k.a. functions, operations (in UML))
    public void demo(int temperatuurCelsius, String message) throws StringIndexOutOfBoundsException, InterruptedException, IOException {
        // comparison of reference types: use, equals, compareto, contains, ....
        if (message.contains("shit")) {
            throw new IOException("Scheldwoorden zijn niet toegestaan.");
        }

        if (message.equals("")) { // message == ""
            throw new IllegalArgumentException("Bericht mag niet leeg zijn.");
        }

        System.out.println(message);

        char lastChar = getLastChar(message);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
            return;
        }

        Thread.sleep(1000);

        if (lastChar == '!') {
            System.out.println("Niet zo schreeuwen!!!!!!");
        }

        // comparison of primitive types: use default operators like ==, <, !, ...
        if (temperatuurCelsius < 0) {
            System.out.println("Koud hè?!");
        }

        if (temperatuurCelsius == 0) {
            System.out.println("Niet warm, niet koud.");
        }

        while ((temperatuurCelsius = haalTempUitDatabase()) > 0) {
            System.out.println("Vandaag is het: " + temperatuurCelsius);
        }
    }

    private int haalTempUitDatabase() {
        return new Random().nextInt(100);
    }

    // class member: ----------------------------
    public static char getLastChar(String message) {
        if (message == null || message.isEmpty() || message.isBlank()) throw new IllegalArgumentException("Message mag niet leeg zijn.");

        int lastIndex = message.length();
        return message.charAt(lastIndex - 1);
    }
}

class NogIets {

}

class EnNogIets {

}
