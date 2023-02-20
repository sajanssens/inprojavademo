package org.example;

import java.math.BigDecimal;

public class PrimitivesDemo {

    void run() {
        byte temperature = 127;  //   8  bits = -128..127
        short colorTemp = 32000; //  16  bits = -32768..32767
        char letter = 'a';       //  16  bits =  0..65535
        char number = 65000;
        char maxValue = (char) 65536; // overflow!!
        int getal = 34000;       //  32  bits = -2147483648..2147483647
        long grootGetal = 9223372036854775800L; //  64  bits = -(heelveel-1)..heelveel
        float koorts = 37.8F; // 32 bits floating point = ???
        double koorts2 = 37.8;// 64 bits floating point
        boolean isBramGek = temperature < 5 && koorts > 38.0;

        // nooit double gebruiken voor geld!!
        System.out.println(0.59 + 0.33); // fout!!!

        BigDecimal bedrag1 = new BigDecimal("0.59");
        BigDecimal bedrag2 = new BigDecimal("0.33");
        BigDecimal som = bedrag1.add(bedrag2);
        System.out.println(som);
    }
}
