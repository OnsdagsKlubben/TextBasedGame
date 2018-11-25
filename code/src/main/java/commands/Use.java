package commands;

import controllers.GameController;

public class Use extends Command 
{
    public Use() 
    {
        this.keyword = "use";
    }

    @Override
    public void runCommandFunction(GameController controller, String[] args) 
    {

    }
}