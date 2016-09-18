
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by scott_000 on 9/18/2016.
 */
public class PlayerManager {
    public static void main(String[] args) {
        //call method to add players, and store in array
        //call method to print players to console
        Scanner input = new Scanner(System.in);
        System.out.println("Enter player names, separated by ' , ': ");
        String playerName = input.nextLine();
        createPlayers(playerName);
    }


    private static void createPlayers(String playerName){
        ArrayList<String> playerArray = new ArrayList<String>(Arrays.asList(playerName.split(" , ")));
        System.out.print(playerArray);

    }



}

