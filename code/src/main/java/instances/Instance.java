package instances;

import gameobjects.Item;

import java.util.ArrayList;
import java.util.HashMap;

public class Instance
{
    //Only used for debugging purposes
    private String instanceName;

    private String enterDescription;
    private HashMap<String, Instance> exits;
    private ArrayList<Item> items;
    private boolean visited = false;

    public Instance(String instanceName, String enterDescription, ArrayList<Item> items, HashMap<String, Instance> exits) 
    {
        this.instanceName = instanceName;
        this.enterDescription = enterDescription;
        this.exits = exits;
        this.items = new ArrayList<Item>();
    }

    public String getEnterDescription()
    {
        visited = true;
        return enterDescription;
    }

    public HashMap<String, Instance> getExits() 
    {
        return exits;
    }

    public ArrayList<Item> getInstanceItems()
    {
        return items;
    }

    public void addInstanceItem(Item item)
    {
        items.add(item);
    }

    public boolean hasBeenVisited()
    {
        return visited;
    }
    
    @Override
    public String toString()
    {
        return instanceName;
    }
}