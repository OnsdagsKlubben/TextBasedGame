package utilities;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 * The InputHandler class is used for receiving input from the player
 * and parsing them to integers, doubles or strings
 * @author Søren Carlsen & Marcus Bender
 */
public class InputHandler 
{
    /**
     * The scanner object which will read from the System.in stream.
     */
    private static Scanner scanner = new Scanner(System.in);

    private InputHandler() {}

    /**
     * Waits for user input, then returns it.
     * @return the {@code String} input recieved from player
     */
    public static String getString()
    {
        return scanner.next();
    }

    /**
     * Waits for user input then tries to parse input string to an integer, then returning it.
     * <p>
     * If the input cannot be parsed to a integer type, the method will display a message
     * telling the player to input a whole number (integer)
     * @return the parsed {@code integer} input from the player
     */
    public static int getInt()
    {
        String input = getString();

        while(!isNumerical(input) || input.contains(",") || input.contains("."))
        {
            DisplayHandler.displayLn("Du skal skrive et hel tal! Prøv igen..");
            input = getString();
        }

        return Integer.parseInt(input);
    }

    /**
     * Waits for user input then tries to parse input string to a double, then returning it.
     * <p>
     * If the input cannot be parsed to a double type, the method will display a message
     * telling the player to input a numerical value.
     * @return the parsed {@code double} input from the player
     */
    public static double getDouble()
    {
        String input = getString();

        while (!isNumerical(input))
        {
            DisplayHandler.displayLn("Du skal skrive et tal! Prøv igen..");
            input = getString();
        }
        return Double.parseDouble(input);
    }

    /**
     * 
     * @param input the {@code String} to check whether can be parsed or not.
     * @return {@code true} if input can be parsed to either {@code int, double} etc, otherwise {@code false}
     */
    private static boolean isNumerical(String input)
    {
        NumberFormat nf = NumberFormat.getInstance();

        for (int i = 0; i < input.length(); i++) 
        {
            if (!Character.isDigit(input.charAt(i))) 
            {
                return false;
            }
        }

        try 
        {
            nf.parse(input);
            return true;    
        } 
        catch (Exception e) 
        {
            return false;
        }
    }
}