
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by scott_000 on 9/18/2016.
 */
public class PlayerManager {
    public static void main(String[] args) {
        //Defensive or Offensive player
        Scanner input = new Scanner(System.in);
        System.out.println("Defensive or Offensive player? (D for Defensive; O for Offensive):  ");
        String playerType = input.nextLine();

        //Get Name and DOB
        System.out.println("Enter player's name: ");
        String name = input.nextLine();
        System.out.println("Enter player's DOB: ");
        String dateOfBirth = input.nextLine();

        //Create NFL Object
        NFLPlayer newPlayer = new NFLPlayer();
        newPlayer.name = name;
        newPlayer.dateOfBirth = dateOfBirth;

        //Implement Celebrator
        newPlayer.celebrate();

    }

    private static void createPlayers(String playerName){
        ArrayList<String> playerArray = new ArrayList<String>(Arrays.asList(playerName.split(" , ")));
        System.out.print(playerArray);

    }



}

