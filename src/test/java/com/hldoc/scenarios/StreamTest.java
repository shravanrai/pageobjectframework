package com.hldoc.scenarios;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamTest {
    /*
    map --intermediate operation
    filter
    sorging

    collect
    foreach
    reduce --sum,

     */


    public static void main(String[] args) {
        int[] ints = {11, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Arrays.toString(ints) = " + Arrays.toString(ints));

        IntStream stream = Arrays.stream(ints);
/*        String s = Arrays.toString(stream.toArray());
        System.out.println("s = " + s);*/
/*
        stream.forEach(n->{
            System.out.println("n = " + n);
        });*/

        //stream.map(x->x*x).forEach(y-> System.out.println("y = " + y));
      /*  int reduce = stream.reduce(0, (ans, i) -> ans + i);
        System.out.println("reduce = " + reduce);*/

        Set<Integer> items = new HashSet<>();
        int asInt = stream.reduce(Integer::min).getAsInt();
        System.out.println("reduce = " + asInt);


        Integer[] IntegerList = {1, 2, 3, 4, 5};
        //Find Duplicate
        List<Integer> integers = Arrays.asList(IntegerList);
        Set<Integer> collect = integers.stream().filter(n -> !items.add(n)).collect(Collectors.toSet());
    }

}

