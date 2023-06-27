package com.clean.architecture.Greeting;

public class GreetingEntity {

    private final String message;

    public GreetingEntity(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
