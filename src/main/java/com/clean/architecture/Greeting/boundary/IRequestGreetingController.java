package com.clean.architecture.Greeting.boundary;

import com.clean.architecture.Greeting.GreetingResponseModel;

public interface IRequestGreetingController {
    GreetingResponseModel sayHelloWorld();
}
