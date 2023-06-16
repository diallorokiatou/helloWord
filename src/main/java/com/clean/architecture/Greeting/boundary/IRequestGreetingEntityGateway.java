package com.clean.architecture.Greeting.boundary;

import com.clean.architecture.Greeting.GreetingEntity;

public interface IRequestGreetingEntityGateway {
    GreetingEntity sayHelloWord();
}
