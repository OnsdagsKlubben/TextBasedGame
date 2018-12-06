package utilities;

import java.util.Scanner;

public class InputHandler 
{
    private static Scanner scanner = new Scanner(System.in);

    private InputHandler() {}

    public static String getString()
    {
        return scanner.next();
    }

    //TODO: add type safety garanteee
    public static int getInt()
    {
        return scanner.nextInt();
    }

    public static double getDouble()
    {
        return scanner.nextDouble();
    }
}