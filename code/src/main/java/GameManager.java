import game.Game;

public final class GameManager 
{
    private Game currentGame;

    /**
     * The single instance of GameManager
     */
    public static GameManager instance = null;
    
    private GameManager() {}

    public static GameManager getInstance()
    {
        if (instance == null) 
        {
            instance = new GameManager();    
        }
        return instance;
    }

    public void loadGame(Game game)
    {
        currentGame = game;
    }

    public void startGame()
    {
        currentGame.startAdventure();
        exit();
    }

    public void exit()
    {
        System.exit(-1);
    }
}