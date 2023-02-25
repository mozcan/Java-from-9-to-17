package com.mozcan.java9;

public interface Writable {

    default void write() {
        doWrite();
    }

    // With Java9 can be use private method in interface
    private void doWrite() {
        System.out.println("Private Write Method");
    }
}
