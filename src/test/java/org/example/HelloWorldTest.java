package org.example;

import org.junit.jupiter.api.Test;

public class HelloWorldTest {

    @Test
    void givenAHelloWorldInstanceWhenICallWieBenIkThen(){
        // given
        HelloWorld myFirstApp = new HelloWorld();

        // when
        myFirstApp.wieBenIk();

        // then
        // is de uitkomst gelijk aan wat ik verwacht?
    }

}
