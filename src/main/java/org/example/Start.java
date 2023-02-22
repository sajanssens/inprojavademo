package org.example;

import java.io.IOException;

public class Start {

    public static void main(String[] args) {
        // HelloWorld myFirstApp = new HelloWorld();
        // myFirstApp.wieBenIk();

        PrimitivesDemo primitivesDemo = new PrimitivesDemo();
        primitivesDemo.run();

        try {
            Comparisons c = new Comparisons();
            c.demo(20, "abcdefgh!");
        } catch (StringIndexOutOfBoundsException deFout) {
            System.out.println("String index klopt niet ..." + deFout.getMessage());
            deFout.printStackTrace();
        } catch (InterruptedException deFout) {
            System.out.println("Thread werd onderbroken ..." + deFout.getMessage());
            deFout.printStackTrace();
        } catch (IOException deFout) {
            System.out.println("Input klopte niet: " + deFout.getMessage());
            // deFout.printStackTrace();
        }

        System.out.println("Klaar!");
    }
}
