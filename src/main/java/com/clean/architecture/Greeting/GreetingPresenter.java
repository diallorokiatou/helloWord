package com.clean.architecture.Greeting;

import com.clean.architecture.Greeting.boundary.IRequestGreetingPresenter;

public class GreetingPresenter implements IRequestGreetingPresenter {
    @Override
    public GreetingResponseModel mapFrom(GreetingEntity greetingEntity) {
        return new GreetingResponseModel(greetingEntity.getMessage());
    }
}
