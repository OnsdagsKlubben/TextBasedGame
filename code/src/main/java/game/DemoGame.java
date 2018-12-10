package game;

import utilities.DisplayHandler;
import utilities.InputHandler;

/**
 * A subclass to the {@code Game} class. This class
 * holds the story logic and variables
 * @author Marcus Bender & Nicklas List
 */
public class DemoGame extends Game 
{
    /**
     * the DemoMissionText object which holds every text, that is used in the {@code startAdventure()} method.
     */
    private DemoMissionText missionText;
    private boolean hasBrightness = false;

    /**
     * The constructor that calls the super constructor and passes in the {@code Player} object.
     * it also initializes the {@code missionText}.
     * @param player the {@code Player} object
     */
    public DemoGame(Player player) 
    {
        super(player);
        missionText = new DemoMissionText();
    }
    
    /**
     * The overridden method that holds all the story logic
     */
    @Override
    public void startAdventure() 
    {

        missionText.historieStart();
        // Kalder menuen til første rum fra missionText klassen.
        // Oprettet en int userPick hvor brugeren kan dirigere i menuen. 
        
        while (true) 
        {

            missionText.firstRoomMenu();

            int userPick = InputHandler.getInt();

            DisplayHandler.clearDisplay();

            if (userPick == 1)
            {
                missionText.gammelMandTekst();  
                continue;
            }
            
            if (userPick == 2 && !player.hasItem("Tændstikker") && !hasBrightness)
            {
                missionText.reolTekstEt();
                //inventory.add(1);
                player.addItem("Tændstikker");
                continue;
            }
            
            if (userPick == 2 && player.hasItem("Tændstikker") && !hasBrightness)
            {
                missionText.reolTekstTo();
                continue;      
            }
            
            if (userPick == 2 && player.hasItem("Tændstikker") && hasBrightness)
            {
                missionText.reolTekstTre();  
                double userPickPi = 0; 

                while(true)
                {
                    userPickPi = InputHandler.getDouble();
                    if (userPickPi == 3.1415)          
                    {
                        missionText.roomTwoEntrance(); 
                        break;  
                    }
                    else 
                    {
                        missionText.learnPi();   
                    }
                }
            }
            
            if (userPick == 3 && !player.hasItem("Tændstikker") && !hasBrightness)
            {
                missionText.træBordTekstEt();        
            }
            
            if (userPick == 3 && player.hasItem("Tændstikker") && !hasBrightness)
            {
                missionText.træBordTekstTo();
                hasBrightness = true;
                continue;
            }
            
            if (userPick == 3 && player.hasItem("Tændstikker") && hasBrightness)
            {
                missionText.træBordTekstTre();
                //continue;
            }
            
            if (userPick == 4)
            {
                player.printInventory();
            }
                    
            if (userPick == 5)
            {
                missionText.exitTekst();
                userPick = InputHandler.getInt();   

                if (userPick == 1)
                {
                    break;
                }
                else if (userPick == 2)
                {
                    missionText.backToExitTekst();
                }        
            }
        }
    }
}