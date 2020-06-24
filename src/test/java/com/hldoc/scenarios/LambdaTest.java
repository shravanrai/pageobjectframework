package com.hldoc.scenarios;

import java.util.Arrays;
import java.util.stream.IntStream;

public class LambdaTest {

    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        System.out.println("Arrays.toString(ints) = " + Arrays.toString(ints));

        IntStream stream = Arrays.stream(ints);
/*        String s = Arrays.toString(stream.toArray());
        System.out.println("s = " + s);*/
/*
        stream.forEach(n->{
            System.out.println("n = " + n);
        });*/

       //stream.map(x->x*x).forEach(y-> System.out.println("y = " + y));
        int reduce = stream.reduce(0, (ans, i) -> ans + i);
        System.out.println("reduce = " + reduce);
    }
}
