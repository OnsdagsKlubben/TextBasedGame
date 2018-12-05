package controllers;

public class GameController 
{
    private static GameController instance = null;

    private InstanceController instanceController;
    private PlayerController playerController;

    private GameController() 
    {
        instanceController = InstanceController.getInstance();
        playerController = PlayerController.getInstance();
    }

    public static GameController getInstance()
    {
        if (instance == null) 
        {
            instance = new GameController();    
        }
        return instance;
    }

    public InstanceController getInstanceController()
    {
        return instanceController;
    }

    public PlayerController getPlayerController()
    {
        return playerController;
    }
}