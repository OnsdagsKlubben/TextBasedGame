package utilities;

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

}