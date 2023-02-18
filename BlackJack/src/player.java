import java.lang.Math.*;
import java.util.HashMap;
public class player {
    //these are the variables that will be used to set cards for the the player
    // "topcard" == face up card
    // "bottomcard" == face down card
    String name;
    int BottomCard = 0;
    int TopCard = 0;
    String topcard = "";
    String bottomcard = "";
    static int  numplayers = 0;
    int playernumber = 0;

    /**
     * this method will be used to create a "player" and set the variables to random cards.
     * 2 extra variables are made to set the main variables. they will be set randomly between 1 and 13.
     * if either variable is higher than 10, it will be assigned accordingly to the "jack", "Queen", or "King".
     */
    public player(String person){
        this.name = person;
        numplayers++;
        this.playernumber = numplayers;
        
        int x = ((int)(Math.random() * 14) + 1); 
        int y = ((int)(Math.random() * 14) + 1);
        
        BottomCard = x;
        TopCard = y;
    }


    //============================================================================================================================

    //returnable methods
    
    /**
     * this method will be used to retrieve the top card information
     * @return String 
     */
    public String getTop(){
        if (TopCard > 10){
        
            if (TopCard == 11){
                topcard = "Jack";
                TopCard = 10;
            } else if (TopCard == 12){
                topcard = "Queen";
                TopCard = 10;
            } else if (TopCard == 13){
                topcard = "King";
                TopCard = 10;
            } else {
                topcard = "Ace";
                TopCard = 1;
            }
            
            return "top card is " + topcard;
        }
        return "top card is " + TopCard;
    }
    /**
     * this method is used to retrieve bottom card information
     * @return
     */
    public String getBottom(){
        if (BottomCard > 10){
        
            if (BottomCard == 11){
                bottomcard = "Jack";
                BottomCard = 10;
            } else if (BottomCard == 12){
                bottomcard = "Queen";
                BottomCard = 10;
            } else if (BottomCard == 13){
                bottomcard = "King";
                BottomCard = 10;
            } else {
                bottomcard = "Ace";
                BottomCard = 1;
            }   
    
            return "bottom card is " + bottomcard;
        }
        return "bottom card is " + BottomCard;
    }

     /**
      * this method will be used to view a specific player's top card 
      * @param person which is a 
      * @return String
      */
    public String viewCard(player person){
        return "player " + person.getPlayerNum()+ "'s "  + person.getTop();
    }
    /**
     * this method will be used to retrieve a player's assigned number
     * @return int playernumber
     */
    public int getPlayerNum(){
        return playernumber;
    }

    public void tap(){
        int add = ((int)(Math.random() * 14) + 1); 
        TopCard += add;
    }

    public int numofplayers(){
        return numplayers;
    }

}
