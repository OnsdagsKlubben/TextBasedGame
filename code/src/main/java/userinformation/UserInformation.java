package userinformation;

public final class UserInformation 
{
    private static OSType osType;
    private static String userPath;

    public static OSType getUserOSType()
    {
        return osType;
    }

    public static String getUserPath()
    {
        return userPath;
    }

    public static void findAndSetUserInfo()
    {
        findAndSetOSType();
        findAndSetUserPath();
    }


    private static void findAndSetOSType()
    {
        String osName = System.getProperty("user.name");

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

    private static void findAndSetUserPath()
    {
        userPath = System.getProperty("user.home");
    }
}