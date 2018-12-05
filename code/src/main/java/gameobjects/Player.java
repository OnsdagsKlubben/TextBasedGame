package gameobjects;

import gameobjects.Item;

public class Player 
{
    //Fields
    private Item[] inventory;

    //Constructors
    public Player() 
    {
        inventory = new Item[4];    
    }

    public boolean isInventoryFull()
    {
        for (int i = 0; i < inventory.length; i++) 
        {
            if (inventory[i] == null) 
            {
                return false;
            }
        } 
        return true;
    }

    public Item[] getInventory()
    {
        return inventory;
    }

    public void addInventoryItem(Item item)
    {
        for (int i = 0; i < inventory.length; i++) 
        {
            if (inventory[i] == null)
            {
                inventory[i] = item;     
            }
        }
    }

    public void removeInventoryItem(int index)
    {
        if (isInBounds(index)) 
        {
            inventory[index] = null;
        }
    }

    private boolean isInBounds(int index)
    {
        return inventory.length-1 >= index ? true : false;
    }
}