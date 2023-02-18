import java.util.Scanner;
public class BlackJack{
    public static void main(String[] args) {
        
        //start of the game. 
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello welcome to Black Jack! Would you care to play?");
        String ans = scan.nextLine().toLowerCase();
        
        // if (){} == game is being played. else{} == not being played
        if (ans == "yes" || ans == "yuh" || ans == "yeah"){
            System.out.println("Great! Who all will be joining us this evening?"):
            int numplayers = scan.nextInt();
            System.out.prinln("Ok! Now I will now pass out the cards.");
            player("Dealer");
            for (int i = 1; i < numplayers; i++){
                System.out.println("What is player " + (i + 1) + "\'s name?");
                String name = scan.nextLine();
                player(name);
            }
            System.out.println("now we will begin");
            for (int j = 0; j < numofplayers(); j++){
                System.out.println("player " + (j + 1) + " it is your turn.");
                System.out.println("say \"tap\" to get another card say \"pass\" to go to the next player.");
                String answer = scan.nextLine().toLowerCase();
                if (answer == "tap"){
                    player 
                }
            }
            
        } else {
            System.out.println("ok have a nice night.");
        }



    }
}