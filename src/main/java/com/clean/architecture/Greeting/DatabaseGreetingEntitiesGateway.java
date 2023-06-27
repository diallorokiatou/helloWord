package com.clean.architecture.Greeting;

import com.clean.architecture.Greeting.boundary.IGreetingEntitiesGateway;

public class DatabaseGreetingEntitiesGateway implements IGreetingEntitiesGateway
{
    //private Database db;

    @Override
    public GreetingEntity get()
    {
       // db.OpenConnection();
       // return db.GetGreetingEntity();
        return null;
    }
}
