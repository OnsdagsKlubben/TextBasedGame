package game;

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
                    System.out.println("You added " + item + " to your backpack!");    
                }
            }
        }
        System.out.print("You don´t have enough space for that!");
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