package com.mozcan.java10;

import java.util.List;
import java.util.HashMap;
import java.util.stream.Collectors;

public class Java10 {
    public static void main(String[] args) {

        System.out.println("var can be used as local variable");

        var text = "Mustafa";
        var number = 32;
        var map = new HashMap<Integer,String>();
        var var = 3.4;
        final var canNotChange = Boolean.TRUE;

        //var c; It can not use without initializer
        //var list = null; Null and var can not use together
        //public var number = 32; var can only be used as local variable

        System.out.println("-----------------------------------------------");

        System.out.println("New methods are added in List,Map and Set");

        List<Integer> list = List.of(28, 29, 30);
        List<Integer> newList = list.stream().filter(item -> item % 2 == 0).collect(Collectors.toUnmodifiableList());
        System.out.println(newList);
        //newList.add(32); It throws UnsupportedOperationException due to 'toUnmodifiableList'

        List<Integer> copyList = List.copyOf(list);
        //copyList.add(32); It throws UnsupportedOperationException due to 'toUnmodifiableList'

        System.out.println("-----------------------------------------------");

        System.out.println("Java 10 Performance Improvements\n");

        System.out.println("Parallel Full GC for G1 \nApplication Class-Data Sharing \nExperimental Java-Based JIT Compiler");

    }
}