import game.DemoGame;
import game.Player;

public final class Program 
{
    public static void main(String[] args) 
    {
        GameManager gm = GameManager.getInstance();
        DemoGame game = new DemoGame(new Player("Fred"));
        gm.loadGame(game);
        gm.startGame();
    }
}
