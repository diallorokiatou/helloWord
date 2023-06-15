package com.clean.architecture.Greeting;

public class GreetingResponseModel{
    private final String message;

    public GreetingResponseModel() {
        this.message = "";
    }

    public GreetingResponseModel(GreetingEntity greetingEntity) {
        if(greetingEntity == null)
            throw new RuntimeException();
        this.message = greetingEntity.getMessage();
    }

    public String getMessage() {
        return message;
    }
}
