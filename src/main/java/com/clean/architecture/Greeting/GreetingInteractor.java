package com.clean.architecture.Greeting;


import com.clean.architecture.Greeting.boundary.IGreetingEntitiesGateway;
import com.clean.architecture.Greeting.boundary.IGreetingPresenter;

public class GreetingInteractor {
    private final IGreetingEntitiesGateway entityGateway;
    private final IGreetingPresenter presenter;
    public GreetingInteractor() {
        this.entityGateway = new HardCoreGreetingEntitiesGateway();
        this.presenter = new GreetingPresenter();
    }

    public GreetingResponseModel sayHello() {
        GreetingEntity greetingEntity = entityGateway.get();
        return presenter.mapFrom(greetingEntity);
    }
}
