import utilities.LogHandler;

public final class GameMenu 
{
    private GameMenu() {}

    public static void display()
    {
        LogHandler.Log(
            "░▒▓ START MENU ▓▒░\n" + 
            "1. Start new game\n" +
            "2. Load game file\n" +
            "3. Options\n" +
            "3. Exit\n"
        );
    }

    public static void runOP(int opCode)
    {

    }
}