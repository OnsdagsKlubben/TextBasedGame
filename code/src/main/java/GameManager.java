import game.Game;

/**
 * The GameManager is used for 'managing' the game
 * i.e loading, playing and exiting the game.
 * The class uses a singleton pattern, meaning that only
 * one instance/object can exists at once during the program.
 * @author Frederik Lundbeck
 */
public final class GameManager 
{
    private Game currentGame;

    /**
     * The single instance of GameManager
     */
    public static GameManager instance = null;

    /**
     * the constructor is made private so other classes can´t create objects of GameManager
     */
    private GameManager() {}

    /**
     * The method that initializes instance to new GameManager if
     * instance equals null.
     * @return returns the instance object of type {@code GameManager}
     */
    public static GameManager getInstance()
    {
        if (instance == null) 
        {
            instance = new GameManager();    
        }
        return instance;
    }

    /**
     * Sets the private variable {@code currentGame} to the passed {@code Game} object in the parameter 
     * @param game the {@code Game} object which to set currentGame equal to
     */
    public void loadGame(Game game)
    {
        currentGame = game;
    }

    /**
     * Starts the game by executing the startAdventure() method in the currentGame object.
     * When the program returns back, it executes the exit() method
     */
    public void startGame()
    {
        currentGame.startAdventure();
        exit();
    }

    /**
     * Exits the application
     */
    public void exit()
    {
        System.exit(-1);
    }
}