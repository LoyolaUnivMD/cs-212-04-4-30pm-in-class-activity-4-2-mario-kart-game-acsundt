//import package
import java.util.Scanner;
class MarioKartPlayer {
    //initializing attributes
    private String playerName;
    public String character;
    private int speed;

    //General Constructor
    public MarioKartPlayer(String playerName, String character, int speed){
        this.playerName = playerName;
        this.character = character;
        this.speed = speed;

    } //End MarioKartPlayer constructor

    //Default constructor
    public MarioKartPlayer(){
        this.playerName = "Unknown";
        this.character = "Unknown";
        this.speed = 0;

    }//End Default constructor

    public int boostAction(String character){
        speed += 5;
        System.out.println(character+" got a speed boost!");
        return speed;
    }

    public void displayInformation(){
        System.out.println("Player Name: "+playerName+"\nCharacter: "+character+"\nSpeed: "+speed);
    }

}//End MarioKartPlayer class

class MarioKartGame{

    //main method
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        //get info from user for mariokartplayer object
        System.out.println("What's your name Player 1?");
        String player1NameInput = input.nextLine();

        System.out.println("What character do you want to play as?");
        String character1Name = input.next();

        //make 1st player/character object
        MarioKartPlayer character1 = new MarioKartPlayer(player1NameInput,character1Name,5);
        character1.displayInformation();

        System.out.println("What's your name Player 2?");
        String player2NameInput = input.next();

        System.out.println("What character do you want to play as?");
        String character2Name = input.next();

        //make 2nd player/character object
        MarioKartPlayer character2 = new MarioKartPlayer(player2NameInput,character2Name,5);
        character2.displayInformation();

        //output information to user
        System.out.println("");
        character1.boostAction(character1.character);
        System.out.println("");
        character1.displayInformation();
        System.out.println("");
        character2.boostAction(character2.character);
        System.out.println("");
        character2.displayInformation();
    }// end of main method


}//End of mariokartgame class