import game.DemoGame;
import game.Player;
import userinformation.UserInformation;

public final class Program 
{
    public static void main(String[] args) 
    {
        UserInformation.findAndSetUserInfo();

        GameManager gm = GameManager.getInstance();
        DemoGame game = new DemoGame(new Player("Fred"));
        gm.loadGame(game);
        gm.startGame();
    }
}
