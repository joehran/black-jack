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

        } else {
            System.out.println("ok have a nice night.");
        }



    }
}