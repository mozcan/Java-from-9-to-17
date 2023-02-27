package com.mozcan.java11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Java11 {
    public static void main(String[] args) throws IOException {

        System.out.println("Running Java File with single command\n");
        System.out.println("One major change is that you don’t need to compile the java source file with javac tool first.\n");
        System.out.println("You can directly run the file with java command and it implicitly compiles.\n");


        System.out.println("-----------------------------------------------");

        System.out.println("New methods are added to the String class like 'lines','strip','isBlank',...");

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

        System.out.println("Local-Variable Syntax for Lambda Parameters");

        Comparator<String> comp1 = (String first, String second) ->
                first.length() - second.length();

        Comparator<String> comp3 = (var first, var second) ->
                second.length() - first.length();

        System.out.println("-----------------------------------------------");


        System.out.println("Reading/Writing Strings to and from the Files");

        Path path = Files.writeString(Files.createTempFile("test", ".txt"), "This was posted on JD");
        System.out.println(path);
        String s = Files.readString(path);
        System.out.println(s); //This was posted on JD
    }
}