package com.clean.architecture.Greeting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GreetingResponseModelTest {

    @Test
    void uniqueMessage() {

        GreetingResponseModel responseModel = new GreetingResponseModel(new GreetingEntity());
        assertEquals("Hello world", responseModel.getMessage());
    }
}