package commands;

import controllers.GameController;

public abstract class Command 
{
    protected String keyword;

    public Command(String keyword) 
    {
        this.keyword = keyword;
    }

    public abstract void runCommand(GameController controller, String[] args);

    public String getKeyWord()
    {
        return keyword;
    }
}