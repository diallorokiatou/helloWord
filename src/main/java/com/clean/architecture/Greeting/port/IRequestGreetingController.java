package com.clean.architecture.Greeting.port;

import com.clean.architecture.Greeting.GreetingResponseModel;

public interface IRequestGreetingController {
    public GreetingResponseModel sayHelloWorld();
}
