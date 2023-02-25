package com.mozcan.java10;

import java.util.List;
import java.util.HashMap;
import java.util.stream.Collectors;

public class java10 {
    public static void main(String[] args) {
        // var can be used as local variable

        var text = "Mustafa";
        var number = 32;
        var map = new HashMap<Integer,String>();
        var var = 3.4;
        final var canNotChange = Boolean.TRUE;

        //var c; It can not use without initializer
        //var list = null; Null and var can not use together
        //public var number = 32; var can only be used as local variable

        /* -----------------------------------------------------*/
        // New methods are added in List,Map and Set

        List<Integer> list = List.of(28, 29, 30);
        List<Integer> newList = list.stream().filter(item -> item % 2 == 0).collect(Collectors.toUnmodifiableList());
        //newList.add(32); It throws UnsupportedOperationException due to 'toUnmodifiableList'

        List<Integer> copyList = List.copyOf(list);
        //copyList.add(32); It throws UnsupportedOperationException due to 'toUnmodifiableList'

        /* -----------------------------------------------------*/
    }
}