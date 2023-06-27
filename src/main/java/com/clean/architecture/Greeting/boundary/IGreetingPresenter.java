package com.clean.architecture.Greeting.boundary;

import com.clean.architecture.Greeting.GreetingEntity;
import com.clean.architecture.Greeting.GreetingResponseModel;

public interface IGreetingPresenter {
    GreetingResponseModel mapFrom(GreetingEntity greetingEntity);
}
