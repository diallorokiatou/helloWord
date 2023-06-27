package com.clean.architecture.Greeting;

import com.clean.architecture.Greeting.boundary.IGreetingPresenter;

public class GreetingPresenter implements IGreetingPresenter {
    @Override
    public GreetingResponseModel mapFrom(GreetingEntity greetingEntity) {
        return new GreetingResponseModel(greetingEntity.getMessage());
    }
}
