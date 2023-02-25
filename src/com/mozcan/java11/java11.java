package com.mozcan.java11;

import java.util.List;
import java.util.stream.Collectors;

public class java11 {
    public static void main(String[] args) {

        // Running Java File with single command

        /*
        One major change is that you don’t need to compile the java source file with javac tool first.
        You can directly run the file with java command and it implicitly compiles
         */

        System.out.println("-----------------------------------------------");

        // New methods are added to the String class like 'lines','strip','isBlank',...
        String multilineString = "Java is a \n \n great \n programming language.";
        List<String> lines = multilineString.lines()
                .filter(line -> !line.isBlank())
                .map(String::strip)
                .collect(Collectors.toList());

        /*
        strip() is “Unicode-aware” evolution of trim().
        When trim() was introduced, Unicode wasn’t evolved. Now, the new strip() removes all kinds of whitespaces leading
         */

        System.out.println(lines);

        System.out.println("-----------------------------------------------");

        /*
        Path filePath = Files.writeString(Files.createTempFile("C:\\Users\\admin\\IdeaProjects\\javaVersions\\src\\com\\mozcan\\java11", "demo", ".txt"), "Sample text");
        try {
            String fileContent = Files.readString(filePath);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

         */


        System.out.println("-----------------------------------------------");

        //  Local-Variable Syntax for Lambda Parameters
    }
}