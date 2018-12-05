package controllers;

import instances.Instance;
import utilities.LogHandler;

public final class InstanceController 
{
    //Null instance of InstanceNavigator, used for singleton pattern
    private static InstanceController instance = null;
    private Instance currentInstance;

    private InstanceController() {}

    public static InstanceController getInstance()
    {
        if (instance == null) 
        {
            instance = new InstanceController();
        }
        return instance;
    }

    public Instance getCurrentRoom() 
    {
        return currentInstance;
    }

    public void setCurrentInstance(Instance newCurrentInstance) 
    {
        currentInstance = newCurrentInstance;
    }

    public void attemptToChangeInstances(String directionNoun)
    {
        if (currentInstance.getExits().containsKey(directionNoun)) 
        {
            LogHandler.Log("You head off to the " + directionNoun);
            currentInstance = currentInstance.getExits().get(directionNoun);
            displayInstanceEnterDescription();
        } 
        else
        {
            LogHandler.Log("There is no path to the " + directionNoun + "!");
        }
    }

    private void displayInstanceEnterDescription()
    {
        LogHandler.Log(currentInstance.getEnterDescription());
    }
}