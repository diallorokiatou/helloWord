package com.clean.architecture.Greeting;

import com.clean.architecture.Greeting.port.IRequestGreetingService;

public class GreetingService implements IRequestGreetingService {
    @Override
    public GreetingResponseModel sayHello() {
        GreetingEntity greetingEntity = new GreetingEntity();
        return new GreetingResponseModel(greetingEntity);
    }
}
