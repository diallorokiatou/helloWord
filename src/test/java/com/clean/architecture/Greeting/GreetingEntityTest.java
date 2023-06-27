package com.clean.architecture.Greeting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GreetingEntityTest {

    @Test
    void uniqueMessage() {
        GreetingEntity  greetingEntity = new GreetingEntity("Hello world");
        String message = greetingEntity.getMessage();
        assertEquals("Hello world", message);
    }
}