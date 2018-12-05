package commands;

import controllers.GameController;

public class TakeCommand extends Command 
{
    public TakeCommand(String keyword) 
    {
        super(keyword);
    }

    @Override
    public void runCommand(GameController controller, String[] args) 
    {
        controller.getPlayerController().attemptTakingItem(args[1]);                    
	}
}