package game;

/**
 * Stores every text in the story.
 * This class was created so the different language feature could work. (not yet implemented)
 * @author Marcus Bender
 */
public class DemoMissionText 
{
    public void historieStart()
   {
      System.out.println(
      "Vinden blafrer i mine gamle klæder, da jeg står foran den gamle egetræsdør\n" +
      "I det samme jeg vender ryggen mod døren lukkes mine øjne.\n" + 
      "En sødlig lugt, blandet af metal og blod er det sidste jeg husker.\n" +
      "Jeg vågner med i et mørkt rum. Tobakspibens glød fra rummets nordlige hjørne kaster skygger over rummet.\n" +
      "Bag pibens røg, anser jeg en gammel mand, gyngende og knirkende i en stol.\n" +
      "Jeg skimmer rummet og ser en mahogni reol, ved siden af manden.\n" +
      "Bag mig, i rummets sydlige del står et stearinlys på et træbord.\n" + 
      "Det er nat, kan jeg se gennem egetræsdøren.\n");
   }  

   public void firstRoomMenu()
   {
      System.out.println(
         "\n\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n" +
         "Dirigér rundt for at gå til følgende:\n" +
         "1.\tGammel mand\n" +
         "2.\tMahogni reol\n" +
         "3.\tTræbord\n" +
         "4.\tInventory\n" +
         "5.\tEgetræsdør (forlad spil)\n" +
         "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n\n");
   }

   public void gammelMandTekst()
   {
      System.out.println(
      "Hej fremmede,\n"+
      "Spøgelset AsgJar prøvede forgæves at dræbe dig\n"+
      "Han havde ikke nok styrke, og har nu gemt sig på slottet.\n"+
      "Gennemse rummene for at finde spøgelset og opnå din hævn.\n\n"+
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
      System.out.println("Du famler i mørket og får fingrene i stearinlyset.\n" +
      "Stearinlyset er din eneste lyskilde i rummet. Du har intet at tænde lyset med. Led videre.");
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
   
   public void backToExitTekst()
   {
      System.out.println("Tilbage til spillet");
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