import controllers.GameController;

public final class GameManager 
{
    private static GameManager instance = null;
    private GameController gameController;
    private boolean running = false;

    private GameManager() {};

    public static GameManager getInstance()
    {
        if (instance == null) 
        {
            instance = new GameManager();
        }
        return instance;
    }

    private void initComponents()
    {
        gameController = GameController.getInstance();
    }

    public void start()
    {
        initComponents();
        running = true;
        loop();
    }

    private void loop()
    {
        while (running) 
        {
            break;
        }
        exit();
    }

    private void exit()
    {
        System.exit(0);
    }
    
}