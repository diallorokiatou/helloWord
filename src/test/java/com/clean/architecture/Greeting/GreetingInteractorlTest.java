package com.clean.architecture.Greeting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GreetingInteractorTest {

    @Test
    void uniqueMessage() {
        GreetingInteractor greetingInteractor = new GreetingInteractor();
        GreetingResponseModel responseModel = greetingInteractor.sayHello();
        assertEquals("Hello world", responseModel.message());
    }
}