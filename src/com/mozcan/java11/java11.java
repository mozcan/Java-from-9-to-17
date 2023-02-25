package com.mozcan.java11;

import java.util.List;
import java.util.stream.Collectors;

public class java11 {
    public static void main(String[] args) {
        // New methods are added to the String class like 'lines','strip','isBlank',...

        String multilineString = "Java is a \n \n great \n programming language.";
        List<String> lines = multilineString.lines()
                .filter(line -> !line.isBlank())
                .map(String::strip)
                .collect(Collectors.toList());
        /*
            Java is a
            great
            programming language.
        */

        /* -----------------------------------------------------*/

        /*
        Path filePath = Files.writeString(Files.createTempFile("C:\\Users\\admin\\IdeaProjects\\javaVersions\\src\\com\\mozcan\\java11", "demo", ".txt"), "Sample text");
        try {
            String fileContent = Files.readString(filePath);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

         */
    }
}