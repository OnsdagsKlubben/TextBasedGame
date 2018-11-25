package gameobjects.items;

import gameobjects.GameObject;

public class Item extends GameObject 
{
    protected Double weight;

    public Item(String name, String description, Double weight) 
    {
        super(name, description);
        this.weight = weight;
    }

    public Double getWeight()
    {
        return weight;
    }
}