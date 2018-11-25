public final class GameManager 
{
    private static GameManager instance = null;
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

    public void start()
    {
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