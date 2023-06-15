package com.clean.architecture.Greeting.adapter;

import com.clean.architecture.Greeting.GreetingResponseModel;
import com.clean.architecture.Greeting.port.IRequestGreetingController;
import com.clean.architecture.Greeting.port.IRequestGreetingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController implements IRequestGreetingController {
    private final IRequestGreetingService service;

    public GreetingController() {
        this.service = new GreetingService();
    }

    @GetMapping("/")
    public GreetingResponseModel sayHelloWorld(){
        return service.sayHello();
    }

}
