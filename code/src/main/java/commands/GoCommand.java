package commands;

import controllers.GameController;

public class GoCommand extends Command 
{
    public GoCommand(String keyword) 
    {
        super(keyword);
    }

    @Override
    public void runCommand(GameController controller, String[] args) 
    {   
        controller.getInstanceController().attemptToChangeInstances(args[1]);
    }
}