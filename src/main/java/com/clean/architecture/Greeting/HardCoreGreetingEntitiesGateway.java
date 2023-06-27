package com.clean.architecture.Greeting;

import com.clean.architecture.Greeting.boundary.IGreetingEntitiesGateway;

public class HardCoreGreetingEntitiesGateway implements IGreetingEntitiesGateway {
    private final String helloWorld = "HKello world";
    @Override
    public GreetingEntity get() {
        return new GreetingEntity(helloWorld);
    }
}
