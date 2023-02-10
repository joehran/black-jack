import java.lang.Math.*;
import java.util.HashMap;
public class player {
    //these are the variables that will be used to set cards for the the player
    
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
    public player(){
        numplayers++;
        this.playernumber = numplayers;
        
        int x = ((int)(Math.random() * 14) + 1); 
        int y = ((int)(Math.random() * 14) + 1);
        
        BottomCard = x;
        TopCard = y;
    }


    //============================================================================================================================

    //returnable methods
    

    public String getTop(){
        if (TopCard > 10 && TopCard < 14){
        
            if (TopCard == 11){
                topcard = "Jack";
            } else if (TopCard == 12){
                topcard = "Queen";
            } else {
                topcard = "King";
            }
            TopCard = 10;
            return "top card is " + topcard;
        }
        return "top card is " + TopCard;
    }

    public String getBottom(){
        if (BottomCard > 10 && BottomCard < 14){
        
            if (BottomCard == 11){
                bottomcard = "Jack";
            } else if (BottomCard == 12){
                bottomcard = "Queen";
            } else {
                bottomcard = "King";
            }
            BottomCard = 10;
            return "bottom card is " + bottomcard;
        }
        return "bottom card is " + BottomCard;
    }


    public String viewCard(player person){
        return "player " + person.getPlayerNum()+ "'s "  + person.getTop();
    }

    public int getPlayerNum(){
        return playernumber;
    }



}
