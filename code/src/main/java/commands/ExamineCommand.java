package commands;

import controllers.GameController;

public class ExamineCommand extends Command 
{
    public ExamineCommand(String keyword) 
    {
        super(keyword);
    }

    @Override
    public void runCommand(GameController controller, String[] args) 
    {
		
	}
}