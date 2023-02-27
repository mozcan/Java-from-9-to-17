package com.mozcan.java16;

import jdk.incubator.vector.IntVector;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java16 {
    public static void main(String[] args) {

        System.out.println("Stream.toList Method has been added*n");

        List<String> integersAsString = Arrays.asList("1", "2", "3");

        // Before Java 16
        List<Integer> ints = integersAsString.stream().map(Integer::parseInt).collect(Collectors.toList());
        System.out.println("Before Java 16 - "+ ints + "\n");

        // After Java 16
        List<Integer> intsEquivalent = integersAsString.stream().map(Integer::parseInt).toList();
        System.out.println("After Java 16 - "+ intsEquivalent);
        
    }

}
