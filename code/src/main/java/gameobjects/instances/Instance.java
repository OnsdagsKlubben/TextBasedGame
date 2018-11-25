package gameobjects.instances;

import gameobjects.GameObject;

public class Instance extends GameObject
{
    protected BrightnessLevel brightnessLevel;
    
    public Instance(String name, String description, BrightnessLevel brightnessLevel) 
    {
        super(name, description);
        this.brightnessLevel = brightnessLevel;
    }

    public BrightnessLevel getBrightness()
    {
        return brightnessLevel;
    }
}