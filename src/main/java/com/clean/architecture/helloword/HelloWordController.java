package com.clean.architecture.helloword;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWordController {
    @GetMapping("/")
    public String sayHelloWorld(){
        return "Hello world";
    }

}
