package utilities;

import java.io.IOException;

import userinformation.OSType;
import userinformation.UserInformation;

public final class DisplayHandler {

    private DisplayHandler() {}

    public static void displayLn(String message)
    {
        System.out.println(message);
    }

    public static void display(String message)
    {
        System.out.print(message);
    }

    public static void clearDisplay()
    {
        if (UserInformation.getUserOSType() == OSType.WINDOWS) 
        {
            try 
            {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } 
            catch (IOException | InterruptedException e)
            {
                System.out.println("[LOGGING] couldn´t clear screen");
            }
        }
        else
        {
            System.out.print("\033[H\033[2J");
        }
    }

}