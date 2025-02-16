package org.example.enums;

public class Person {

    private String name;

    private Languages language; // HINDI, ENGLISH, FRENCH

    public Person(String name, Languages language) {
        this.name = name;
        this.language = language;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
