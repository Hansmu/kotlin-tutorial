package com.github.kotlintutorial.javacode;

public class JavaEmployee {
    private String firstName;
    private boolean fullTime;

    public JavaEmployee(String firstName) {
        this.firstName = firstName;
        this.fullTime = true;
    }

    public JavaEmployee(String firstName, boolean fullTime) {
        this(firstName);
        this.fullTime = fullTime;
    }
}
