package utilities;

import java.text.NumberFormat;
import java.util.Scanner;

public class InputHandler 
{
    private static Scanner scanner = new Scanner(System.in);

    private InputHandler() {}

    public static String getString()
    {
        return scanner.next();
    }

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