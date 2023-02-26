package com.mozcan.java13;

public class java13 {

    public static void main(String[] args) {
        System.out.println("Yield in switch expression.Break replace with yield in java 13");

        var me = 4;
        var operation = "squareMe";

        var result = switch (operation) {
            case "doubleMe" -> {
                yield me * 2;
            }
            case "squareMe" -> {
                yield me * me;
            }
            default -> me;
        };

        System.out.println(result);

        System.out.println("-----------------------------------------------");

        System.out.println("Text Blocks");

        // Before Java 13
        String JSON_STRING
                = "{\r\n" + "\"name\" : \"Mustafa\",\r\n" + "\"website\" : \"https://www.%s.com/\"\r\n" + "}";

        System.out.println(JSON_STRING);

        // After Java 13
        String TEXT_BLOCK_JSON = """
        {
            "name" : "Mustafa",
            "website" : "https://www.%s.com/"
        }
        """;

        System.out.println(TEXT_BLOCK_JSON);

        System.out.println("-----------------------------------------------");


    }
}
