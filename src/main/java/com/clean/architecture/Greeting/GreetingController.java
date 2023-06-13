package com.clean.architecture.Greeting;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController implements IRequestGreetingController {
    @GetMapping("/")
    public GreetingResponseModel sayHelloWorld(){
        return new GreetingResponseModel("Hello world");
    }

}
