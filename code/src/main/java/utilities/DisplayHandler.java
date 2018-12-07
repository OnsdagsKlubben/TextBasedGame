package utilities;

import java.io.IOException;

import userinformation.OSType;
import userinformation.UserInformation;

/**
 * The DisplayHandler class handles displaying things to the screen. <p>
 * Everything in the application should use DisplayHandler if something
 * needs to be written to the console.
 */
public final class DisplayHandler 
{
    private DisplayHandler() {}

    /**
     * Writes a new line containing the message.
     * @param message to display
     */
    public static void displayLn(String message)
    {
        System.out.println(message);
    }

    /**
     * Writes to current line containing the message.
     * @param message to display
     */
    public static void display(String message)
    {
        System.out.print(message);
    }

    /**
     * Clears the console window
     */
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