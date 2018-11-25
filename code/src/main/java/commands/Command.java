package commands;

import controllers.GameController;

public abstract class Command 
{
    protected String keyword;

    public String keyword()
    {
        return keyword;
    }

    public abstract void runCommandFunction(GameController controller, String[] args);
}
