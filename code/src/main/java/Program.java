import utilities.UserInformation;

public final class Program 
{
    public static void main(String[] args) 
    {
        init();
    }

    public static void init()
    {
        //Get user OS
        UserInformation.getInformation();

        //Handle GameManager
        GameManager gm = GameManager.getInstance();
        gm.start();
    }
}
