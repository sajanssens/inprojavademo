package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

class ComparisonsTest {

    @Test
    void whenGetLastCharIsCalledWithANormalStringThenItReturnsTheLastCharOfThatString() {
        // given
        String helloWorld = "Hello world!";

        // when
        char actual = Comparisons.getLastChar(helloWorld);

        // then
        //   assertions:
        Assertions.assertEquals('!', actual);
    }

    @Test
    void whenGetLastCharIsCalledWithANumericStringThenItReturnsTheLastCharOfThatString() {
        // given
        String message = "1234";

        // when
        char actual = Comparisons.getLastChar(message);

        // then
        //   assertions:
        Assertions.assertEquals('4', actual);
    }

    @Test
    void whenGetLastCharIsCalledEmptyOrBlankOrNullStringThenItThrowsAnIllegalArgumentException() {
        //                                                                               given:
        //                                                            when:
        // then
        //   assertions:
        Assertions.assertThrows(IllegalArgumentException.class, () -> Comparisons.getLastChar(""));
        Assertions.assertThrows(IllegalArgumentException.class, () -> Comparisons.getLastChar("    "));
        Assertions.assertThrows(IllegalArgumentException.class, () -> Comparisons.getLastChar(null));
    }

    @Test
    void whenDemoIsCalledWithInvalidMessageThenIllegalArgExcIsThrown() {
        Comparisons target = new Comparisons();
        String swearWords = "shit";

        IOException e = Assertions.assertThrows(IOException.class, () -> target.demo(0, swearWords));
        Assertions.assertTrue(e.getMessage().contains("Scheldwoorden"));
    }


}
