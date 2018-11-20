package utilities;

public final class UserInformation 
{
    private static OSType osType = null;

    public OSType getOSType()
    {
        return osType;
    }

    private UserInformation() {};

    public static void findAndSetUserOS()
    {
        if (osType == null) {
            String type = System.getProperty("os.type").toLowerCase();

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