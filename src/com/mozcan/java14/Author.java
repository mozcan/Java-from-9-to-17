package com.mozcan.java14;

record Author (int id, String name, String topic) implements Information {
    static int followers;

    public static String followerCount() {
        return "Followers are "+ followers;
    }

    public String description(){
        return "Author "+ name + " writes on "+ topic;
    }

    public Author{
        if (id < 0) {
            throw new IllegalArgumentException( "id must be greater than 0.");
        }
    }

    @Override
    public String getFullName() {
        return "Author "+ name + " writes on " + topic + " and ID is " + id;
    }
}

interface Information {
    String getFullName();
}