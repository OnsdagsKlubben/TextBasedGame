package utilities;

public final class UserInformation 
{
    private static OSType osType = null;
    private static String userHomeDirectory = null;

    private UserInformation(){};

    public static OSType getOSType()
    {
        return osType;
    }

    public static String getUserHomeDirectory()
    {
        return userHomeDirectory;
    }

    public static void getInformation()
    {
        findAndSetUserOS();
        findAndSetUserHomeDirectory();
    }

    private static void findAndSetUserHomeDirectory() 
    {
        if (userHomeDirectory == null) {
            userHomeDirectory = System.getProperty("user.home");
        }
    }

    private static void findAndSetUserOS()
    {
        if (osType == null) {
            String type = System.getProperty("os.name").toLowerCase();

            if (type.contains("windows")) 
            {
                osType = OSType.WINDOWS;
            }
            else if (type.contains("mac")) 
            {
                osType = OSType.MAC;    
            } 
            else 
            {
                osType = OSType.LINUX;
            }
        }
    }
}