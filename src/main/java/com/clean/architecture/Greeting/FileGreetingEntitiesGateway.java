package com.clean.architecture.Greeting;

import com.clean.architecture.Greeting.boundary.IGreetingEntitiesGateway;

public class FileGreetingEntitiesGateway implements IGreetingEntitiesGateway
{
    //private Filesystem fs;//
    @Override
    public GreetingEntity get()
    {
       // var message = fs.Read("some/path/greetingMessage.txt");
       // return new GreetingEntity(message);
        return null;
    }
}
