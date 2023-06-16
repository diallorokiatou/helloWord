package com.clean.architecture.Greeting;

import com.clean.architecture.Greeting.boundary.IRequestGreetingEntityGateway;

public class GreetingEntityGateway implements IRequestGreetingEntityGateway {
    @Override
    public GreetingEntity sayHelloWord() {
        return new GreetingEntity();
    }
}
