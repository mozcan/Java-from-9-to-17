package com.mozcan.java15;

public class Java15 {

    public static void main(String[] args) {

        System.out.println("Sealed Classes\n");
        System.out.println("""
                Sealed classes, as their name suggests, allow you to restrict or allow class hierarchies to only particular kinds.
                With the keywords sealed, permits and non-sealed that comes with Java 15, it is possible to expand only to certain classes and interfaces.
                """);

        Account account = new SecretAccount();
        account.accountName();

    }
}
