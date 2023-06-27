package com.clean.architecture.Greeting;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController{
    private final GreetingInteractor interactor;

    public GreetingController() {
        this.interactor = new GreetingInteractor();
    }

    @GetMapping("/")
    public GreetingResponseModel sayHelloWorld(){
        return interactor.sayHello();
    }

}
