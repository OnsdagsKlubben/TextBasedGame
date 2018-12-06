package game;

import utilities.DisplayHandler;

public class Player 
{
    private static final int INVENTORY_SIZE = 3;
    private String name;
    private String[] inventory;

    public Player(String name) 
    {
        this.name = name;
        inventory = new String[INVENTORY_SIZE];
    }

    public void addItem(String item)
    {
        if (hasInventorySpace()) 
        {
            //get next available inventory index
            for (int i = 0; i < inventory.length; i++) 
            {
                if (inventory[i] == null) 
                {
                    inventory[i] = item;
                    DisplayHandler.displayLn("Du tilføjede " + item + " til din rygsæk!");
                    break;  
                }
            }
        }
        else
        {
            DisplayHandler.displayLn("Du har ikke nok plads i din rygsæk!");
        }
    }

    public void removeItem(String item)
    {
        for (int i = 0; i < inventory.length; i++) 
        {
            if (inventory[i].toLowerCase().equals(item.toLowerCase())) 
            {
                inventory[i] = null;
            }
        }
    }

    public boolean hasItem(String item)
    {
        for (int i = 0; i < inventory.length-1; i++) 
        {    
            if (inventory[i] != null && item.toLowerCase().equals(inventory[i].toLowerCase())) 
            {
                return true;
            }
        }
        return false;
    }

    public void printInventory()
    {
        DisplayHandler.displayLn("Din rygsæk indeholder disse ting:");

        for (int i = 0; i < inventory.length; i++) 
        {
            if (inventory[i] != null) 
            {
                DisplayHandler.displayLn( "[" + i + "] " + inventory[i] );    
            }
            else
            {
                DisplayHandler.displayLn("[" + i + "]");
            }
        }
    }

    private boolean hasInventorySpace()
    {
        for (int i = 0; i < inventory.length; i++) 
        {
            if (inventory[i] == null) 
            {
                return true;
            }
        }
        return false;
    }
}