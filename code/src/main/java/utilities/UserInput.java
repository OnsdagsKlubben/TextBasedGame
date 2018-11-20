package utilities;

import java.util.Scanner;
/**
 * The {@code UserInput} class contains several helpful static methods to
 * both parse String inputs to numerical ones and getting the wanted input 
 * from players. 
 */
public final class UserInput 
{
    private static Scanner input = new Scanner(System.in);

    private UserInput() {};

    /**
     * Waits for user input, then returns the {@code String}  
     * @return The {@code String} entered 
     */
    public static String getStringInput()
    {
        System.out.print(">");
        return input.nextLine();
    }
    /**
     * Waits for user input, then checks if user input is strictly numerical.
     * If the input is numerical we return the input as type {@code int}.
     * If not, the while loop is stepped into, continuing, until user input is 
     * numerical!
     * @return User input parsed to type {@code int}
     */
    public static int getNumericalInput()
    {
        String value = getStringInput();
        while (!isNumericalValue(value)) 
        {
            System.out.println("You must enter a number!");
            value = getStringInput();
        }
        return Integer.parseInt(value);
    }

    /**
     * Waits for user input, then checks if given value is between parameters
     * {@code min}(inclusive) and {@code max}(inclusive).
     * @param min The minimum value
     * @param max The maximum value
     * @return The user input value, that is between {@code min} and {@code max}. 
     */
    public static int getNumericalRangeInput(int min, int max)
    {
        int value = getNumericalInput();

        while (value < min || value > max) 
        {
            System.out.println(String.format("Enter a number between %d and %d", min, max));
            value = getNumericalInput();
        }
        return value;
    }

    //TODO: find more suitable place to store method
    /**
     * This method takes in a {@code String} value and returns true if value is only digits.
     * @param value The {@code String} value to be checked if it only contains digits.
     * @return {@code true} if value is only digits, else {@code false}.
     */
    private static Boolean isNumericalValue(String value)
    {
        for (int i = 0; i < value.length(); i++) 
        {
            if (!Character.isDigit(value.charAt(i))) 
            {
                return false;
            }
        }
        return true;
    }
}