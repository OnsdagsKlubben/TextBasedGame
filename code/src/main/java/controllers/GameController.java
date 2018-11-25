package controllers;

public class GameController 
{
    private static GameController instance = null;
    
    private GameController() {}

    public GameController getInstance()
    {
        if (instance == null) 
        {
            instance = new GameController();    
        }
        return instance;
    }

    public void navigateInstance()
    {
        
    }
}