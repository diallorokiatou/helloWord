package com.clean.architecture.Greeting.port;

import com.clean.architecture.Greeting.GreetingResponseModel;

public interface IRequestGreetingService {
    GreetingResponseModel sayHello();
}