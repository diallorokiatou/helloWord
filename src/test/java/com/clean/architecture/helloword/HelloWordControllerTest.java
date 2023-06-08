package com.clean.architecture.helloword;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
@SpringBootTest
class HelloWordControllerTest {
    @Autowired
    HelloWordController helloWordController;

    @Test
    void sayHelloWorld() {
        String result = helloWordController.sayHelloWorld();
        assertEquals("Hello world", result);
    }
}