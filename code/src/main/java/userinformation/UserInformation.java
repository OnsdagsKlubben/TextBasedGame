package userinformation;

public final class UserInformation 
{
    private static OSType osType;
    private static String userPath;

    /**
     * Returns the OSType of the user
     */
    public static OSType getUserOSType()
    {
        return osType;
    }

    /**
     * Returns the user´s user-path (C:\Users\User)
     */
    public static String getUserPath()
    {
        return userPath;
    }

    /**
     * This method calls two private methods used for finding and setting both the
     * osType and userPath varibles
     */
    public static void findAndSetUserInfo()
    {
        findAndSetOSType();
        findAndSetUserPath();
    }

    /**
     * Gets and sets the operation system of the user
     */
    private static void findAndSetOSType()
    {
        String osName = System.getProperty("os.name");

        if (osName.toLowerCase().contains("windows")) 
        {
            osType = OSType.WINDOWS;    
        }
        else if (osName.toLowerCase().contains("mac"))
        {
            osType = OSType.MAC;
        }
        else
        {
            osType = OSType.LINUX;
        }
    }

    /**
     * Gets and sets the user path
     */
    private static void findAndSetUserPath()
    {
        userPath = System.getProperty("user.home");
    }
}