package org.example;

public class Arrays {

    public static void main(String[] args) {
        int size = 10;
        float wiskunde = 9.3f;
        float nederlands = 4.2f;
        float i = 3.2f;
        float j = 7.2f;
        float h = 8.7f;
        float k = 9.1f;

        float som = wiskunde + nederlands + i + j + k + h;
        float gemiddelde = som / 6;

        float[] proefwerkcijfers = new float[size];
        int length = proefwerkcijfers.length;

        float eerste;
        float laatste;

        eerste = proefwerkcijfers[0];
        laatste = proefwerkcijfers[length - 1];

        System.out.println(eerste);
        System.out.println(laatste);

        proefwerkcijfers[0] = 9.3f;
        proefwerkcijfers[1] = 7.8f;
        proefwerkcijfers[length - 1] = 3.2f;

        eerste = proefwerkcijfers[0];
        laatste = proefwerkcijfers[length - 1];

        System.out.println(eerste);
        System.out.println(laatste);

        float[] proefwerkcijfersLanger = new float[size * 2];

        // loop door de oude array en per element:
        // zet dat element in de nieuwe array op dezelfde index
        for (int index = 0; index < proefwerkcijfers.length; index++) {
            proefwerkcijfersLanger[index] = proefwerkcijfers[index];
        }
        // proefwerkcijfers = null;

        System.out.print("[");
        // for (ieder_element : een_collectie) { // "for each"
        for (float cijfer : proefwerkcijfersLanger) {
            System.out.print(cijfer + ", ");
        }
        System.out.println("]");
    }
}
