package com.mozcan.java12;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.summingDouble;

public class Java12 {

    public static void main(String[] args) {
        System.out.println("Pattern Matching for instanceof");

        //Before Java 12
        Object obj = "Hello World!";
        if (obj instanceof String) {
            String s = (String) obj;
            int length = s.length();
        }

        //After Java 12
        if (obj instanceof String s) {
            int length = s.length();
        }

        System.out.println("-----------------------------------------------");

        System.out.println("Java Strings New Methods");

        String text = "Hello World!\nThis is Java 12 Package.";

        text = text.indent(4);
        System.out.println(text);

        text = text.indent(-10);
        System.out.println(text);


        String textTransform = "Mustafa";
        String transformed = textTransform.transform(value ->
                new StringBuilder(value).reverse().toString()
        );

        System.out.println(textTransform + " - " + transformed);

        System.out.println("-----------------------------------------------");

        System.out.println("Teeing Collector to the Collector Class");

        double mean = Stream.of(1, 2, 3, 4, 5)
                .collect(Collectors.teeing(
                        summingDouble(i -> i),
                        counting(),
                        (sum, n) -> sum / n));

        System.out.println(mean);

        System.out.println("-----------------------------------------------");

        System.out.println("Switch Expressions");

        // Before Java 12
        DayOfWeek dayOfWeek = LocalDate.now().getDayOfWeek();
        String typeOfDay = "";
        switch (dayOfWeek) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                typeOfDay = "Working Day";
                break;
            case SATURDAY:
            case SUNDAY:
                typeOfDay = "Day Off";
        }

        // After Java 12

        typeOfDay = switch (dayOfWeek) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> "Working Day";
            case SATURDAY, SUNDAY -> "Day Off";
        };
    }

}
