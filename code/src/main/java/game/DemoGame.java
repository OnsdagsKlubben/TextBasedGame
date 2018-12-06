package game;

import utilities.InputHandler;

public class DemoGame extends Game 
{
    private DemoMissionText missionText;
    private boolean hasBrightness = false;

    public DemoGame(Player player) 
    {
        super(player);
        missionText = new DemoMissionText();
    }
    
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

            if (userPick == 1)
            {
                missionText.gammelMandTekst();  
                continue;
            }
            
            if (userPick == 2 && !player.hasItem("Matches") && !hasBrightness)
            {
                missionText.reolTekstEt();
                //inventory.add(1);
                player.addItem("Matches");
                continue;
            }
            
            if (userPick == 2 && player.hasItem("Matches") && !hasBrightness)
            {
                missionText.reolTekstTo();
                continue;      
            }
            
            if (userPick == 2 && player.hasItem("Matches") && hasBrightness)
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
            
            if (userPick == 3 && !player.hasItem("Matches") && !hasBrightness)
            {
                missionText.træBordTekstEt();        
            }
            
            if (userPick == 3 && player.hasItem("Matches") && !hasBrightness)
            {
                missionText.træBordTekstTo();
                hasBrightness = true;
                continue;
            }
            
            if (userPick == 3 && player.hasItem("Matches") && hasBrightness)
            {
                missionText.træBordTekstTre();
                //continue;
            }
                    
            if (userPick == 4)
            {
                missionText.exitTekst();
                userPick = InputHandler.getInt();   

                if (userPick == 1)
                {
                    break;
                }
                else if (userPick == 2)
                {
                    System.out.println("Returning");
                }        
            }
            
            if (userPick == 5)
            {
                player.printInventory();
            }

        }
    }
}