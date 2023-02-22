package org.example;

import java.util.function.Function;

public class LambdaDemo {

    public static void main(String[] args) {

        Function<Integer, Integer> f = x -> x * x;
        int result = f.apply(3);
        System.out.println(result);
    }
}
