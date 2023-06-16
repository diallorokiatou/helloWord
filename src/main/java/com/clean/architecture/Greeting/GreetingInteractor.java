package com.clean.architecture.Greeting;


import com.clean.architecture.Greeting.boundary.IRequestGreetingEntityGateway;
import com.clean.architecture.Greeting.boundary.IRequestGreetingPresenter;

public class GreetingInteractor {
    private final IRequestGreetingEntityGateway entityGateway;
    private final IRequestGreetingPresenter presenter;
    public GreetingInteractor() {
        this.entityGateway = new GreetingEntityGateway();
        this.presenter = new GreetingPresenter();
    }

    public GreetingResponseModel sayHello() {
        GreetingEntity greetingEntity = entityGateway.sayHelloWord();
        return presenter.mapFrom(greetingEntity);
    }
}
