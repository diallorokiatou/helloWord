package com.clean.architecture.Greeting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class GreetingEntityTest {
    @Test
    public void alwaysContainMessage(){
        String helloWordMessage = "Hello word";
        GreetingEntity greetingEntity = new GreetingEntity(helloWordMessage);
        assertNotNull(greetingEntity.message());
        assertEquals(helloWordMessage, greetingEntity.message());
    }

}