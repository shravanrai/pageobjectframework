package com.hldoc.scenarios;

import java.util.Arrays;
import java.util.Collections;

public class CollecionsTest {

    public static void main(String[] args) {
        Integer[] num = { 2, 4, 7, 5, 9 };
        Integer min = Collections.min(Arrays.asList(num));
        System.out.println("min = " + min);

        Integer integer = Arrays.stream(num).reduce(Integer::min).get();
        System.out.println("integer = " + integer);

    }


}
