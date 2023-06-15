package com.clean.architecture.Greeting;

import com.clean.architecture.Greeting.port.IRequestGreetingController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class GreetingControllerTest {
    @Value(value="${local.server.port}")
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void shouldImplementInterface() {
        IRequestGreetingController controller = new GreetingController();
        GreetingResponseModel result = controller.sayHelloWorld();
        assertEquals("Hello world", result.getMessage());
    }
    @Test
    public void shouldReturnDefaultMessage() {
        GreetingResponseModel result = this.restTemplate.getForObject("http://localhost:" + port + "/",
                GreetingResponseModel.class);
        assertEquals("Hello world", result.getMessage());
    }
}