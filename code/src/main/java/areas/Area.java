package areas;

public class Area 
{
    protected BrightnessType brightness;
    protected String name;
    protected String description;
    
    public Area() 
    {
    }

    public Area(String name, String description) 
    {
        this.name = name;
        this.description = description;
    }

    public BrightnessType getBrightness()
    {
        return brightness;
    }
}