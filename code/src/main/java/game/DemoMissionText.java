package game;

public class DemoMissionText 
{
    public void historieStart()
   {
      System.out.println("Vinden blafrer i mine gamle klæder, da jeg står foran den gamle egetræsdør\n" +
      "I det samme jeg vender ryggen mod døren lukkes mine øjne. En sødligt lugt, blandet af metal og blod er det sidste jeg husker.\n" +
      "Jeg vågner med i et mørkt rum. Tobakspibens glød fra rummets nordlige hjørne kaster skygger over rummet. Bag pibens røg, anser jeg en gammel mand, gyngende og knirkende i en stol.\n" +
      "Jeg skimmer rummet og ser en mahogni reol, ved siden af manden. Bag mig, i rummets sydlige del står et stearinlys på et træbord. \nDet er nat, kan jeg se gennem egetræsdøren.\n");
   }  

   public void firstRoomMenu()
   {
      System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
      System.out.println("Dirigér rundt for at gå til følgende:");
      System.out.println("1.\tGammel mand");
      System.out.println("2.\tMahogni reol");
      System.out.println("3.\tTræbord");
      System.out.println("4.\tEgetræsdør (forlad spil)");
      System.out.println("5.\tInventory");
      System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
   }

   public void gammelMandTekst()
   {
      System.out.println("Hej fremmede, \n"+
      "Spøgelset AsgJar prøvede forgæves at dræbe dig \n"+
      "Han havde ikke nok styrke, og har nu gemt sig på slottet. Gennemse rummene for at finde spøgelset og opnå din hævn. \n\n"+
      "Find døren til næste rum.");
   }
   
   public void reolTekstEt()
   {
      System.out.println("Du famler i blinde og får fat i en æske tændstikker og lægger dem i lommen.");
   }
   
   public void reolTekstTo()
   {
      System.out.println("Et støvet tomt træbord - intet at finde.");
   }
   
   public void reolTekstTre()
   {
      System.out.println("Der ses tydeligt slidemærker i gulvet til højre for reolen.\n"+
      "Løs gåden for at skubbe døren til side\n"+
      "Skriv de 4 første cifre i PI");
   }
   
   public void træBordTekstEt()
   {
      System.out.println("Du famler i mørket og får fingrene i stearinlyset." +
      " Stearinlyset er din eneste lyskilde i rummet. Du har intet at tænde lyset med. Led videre.");
   }
   
   public void træBordTekstTo()
   {
      System.out.println("Du famler i blinde og får fingrene i stearinlyset." +
      "\nDu hiver tændstikæsken op af lommen og tænder stearinlyset.\n" +
      "Et varmt lys breder sig over rummet.");
   }
   
   public void træBordTekstTre()
   {
      System.out.println("Intet at finde her - led videre");
   }
   
      
   public void exitTekst()
   {
      System.out.println("Du forlader nu spillet - er du sikker?");   
      System.out.println("1. Leave\n2. Return to game");  
   }
   
   public void roomTwoEntrance()
   {
      System.out.println("Du åbnede døren til næste rum.\n" + 
      "Held og lykke med at finde AsgJar.");     
   }
   
   public void learnPi()
   {
      System.out.println("Forkert. Prøv igen!");
   }
}