package controllers;

import gameobjects.Item;
import gameobjects.Player;
import utilities.LogHandler;

public class PlayerController 
{
    private static PlayerController instance = null;
    private GameController controller; 
    private Player player;

    private PlayerController ()
    {
        player = new Player();
        controller = GameController.getInstance();
    }

    public static PlayerController getInstance()
    {
        if (instance == null) 
        {
            instance = new PlayerController();
        }
        return instance;
    }

    public void attemptTakingItem(String itemName)
    {
        for (Item item : controller.getInstanceController().getCurrentRoom().getInstanceItems()) 
        {
            if (item.getName().toLowerCase().equals(itemName.toLowerCase())) 
            {
                if (item.isStorable()) 
                {
                    if (!player.isInventoryFull()) 
                    {
                        LogHandler.Log("You picked up " + item.getDescription());
                        player.addInventoryItem(item);
                        controller.getInstanceController().getCurrentRoom().getInstanceItems().remove(item);
                        break;
                    }
                    else
                    {
                        LogHandler.Log("My inventory is already full!");
                    }
                }
                else
                {
                    LogHandler.Log("I can´t pick that up!");
                }
            }
            else
            {
                LogHandler.Log("I don´t know what " + itemName + " is?");
            }
        }
    }
}