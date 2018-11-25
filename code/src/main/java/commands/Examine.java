package commands;

import controllers.GameController;

public class Examine extends Command
{
    public Examine() 
    {
        this.keyword = "examine";
    }

    @Override
    public void runCommandFunction(GameController controller, String[] args) 
    {
        
    }
}