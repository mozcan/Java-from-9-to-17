package com.mozcan.java14;

public class java14 {
    public static void main(String[] args) {

        System.out.println("Helpful NullPointerExceptions");

        //String name = article.getBlog().getAuthor();

        // Before Java 14 - Stacktrace
        System.out.println("Exception in thread 'main' java.lang.NullPointerException at NullPointerExample.main(NullPointerExample.java:5)");

        // After Java 14 - Stacktrace
        System.out.println("Exception in thread \"main\" java.lang.NullPointerException: Cannot invoke \"Blog.getAuthor()\" because the return value of \"Journaldev.getBlog()\" is null\n" +
                "    at NullPointerExample.main(NullPointerExample.java:4)");

        System.out.println("-----------------------------------------------");

        System.out.println("RECORDS\n");
        System.out.println("The record is a new type of class in Java that makes it easy to create immutable data objects.");

        Author authorYasarKemal = new Author(1,"Yaşar Kemal","İnce Memed");
        System.out.println(authorYasarKemal.name());
        System.out.println(authorYasarKemal.description());
        System.out.println(authorYasarKemal.getFullName());

        Author authorOrhanKemal = new Author(-1,"Orhan Kemal","Tersine Dünya");
    }
}
