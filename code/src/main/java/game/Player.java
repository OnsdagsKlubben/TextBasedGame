package game;

import utilities.DisplayHandler;

/**
 * The player class holds useful information and methods about the player, such as inventory and name.
 */
public class Player 
{
    private static final int INVENTORY_SIZE = 3;
    private String name;
    private String[] inventory;

    /**
     * The player constructor initializes the private name variable from the passed {@code String} in the parameter.
     * It also initializes the inventory {@code String[]} by the size {@code INVENTORY_SIZE} which is set to 3
     * @param name the {@code String} object which {@code this.name} is set to
     */
    public Player(String name) 
    {
        this.name = name;
        inventory = new String[INVENTORY_SIZE];
    }

    /**
     * adds a {@code String} object to the inventory {@code String[]}
     * @param item the {@code String} object to add 
     */
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

    /**
     * searches trough the inventory, if one of the array objects
     * matches the given parameter, the inventory object will be set to null.
     * @param item the {@code String} object which will be tested to see if it equals any of the
     * inventory objects {@code String[]}
     */
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

    /**
     * Checks if inventory contains given {@code String} object passed in the parameter.
     * returns true if it's contained, else false.
     * @param item the {@code String} object we check whether is contained or not
     * @return {@code true} if inventory contains {@code item}, else the method returns {@code false}
     */
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

    /**
     * Prints all the inventory items to the screen
     */
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

    /**
     * Checks if the inventory has more space
     * @return {@code true} if it has more space, otherwise {@code false}
     */
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