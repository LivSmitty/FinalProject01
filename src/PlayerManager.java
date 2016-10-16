
import com.sun.javafx.geom.Matrix3f;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.util.*;

import static java.util.Collections.*;

/**
 * Created by scott_000 on 9/18/2016.
 */
public class PlayerManager extends ShowImage{

    public static void main(String[] args) {

        ShowImage.launch();

        //Set headers
        NFLPlayer.formatOutput();


        //Create NFL Player List
        List<NFLPlayer> playerList = new ArrayList<>();
        playerList.add(new NFLPlayer("Matt Ryan", "5/17/1985", "O", "Atlanta Falcons", "National", 1740.0, 50.0, 0.0, 11.0, 0.0, 2.0));
        playerList.add(new NFLPlayer("Zach Brown", "10/23/1989", "D", "Buffalo Bills", "American", 0, 0, 0, 1, 40, 0));
        playerList.add(new NFLPlayer("Ezekiel Elliott", "7/22/1995", "O", "Dallas Cowboys", "National", 0, 546, 81, 0, 0, 0));
        playerList.add(new NFLPlayer("Von Miller", "3/26/1989", "D", "Denver Broncos", "American", 0, 0, 0, 7.5, 19, 0));
        playerList.add(new NFLPlayer("Marvin Jones", "3/12/1990", "O", "Detroit Lions", "National", 0, 0, 519, 0, 0, 0));
        playerList.add(new NFLPlayer("Marcus Peters", "1/9/1993", "D", "Kansas City Chiefs", "American", 0, 0, 47, 0, 0, 4));
        playerList.add(new NFLPlayer("LeSean McCoy", "7/12/1988", "O", "Buffalo Bills", "American", 0, 447, 95, 0, 0, 0));
        playerList.add(new NFLPlayer("Casey Hayward", "9/9/1989", "D", "San Diego Chargers", "American", 0, 0, 0, 0, 0, 3));

        System.out.print(playerList.toString());

        Scanner input = new Scanner(System.in);
        System.out.println("\n" + "Would you like to delete all players?");
        String delete = input.nextLine();

        //check for correct input
        if (!delete.equals("Y") && !delete.equals("N"))
            System.out.print("Incorrect input. Try again");
        System.exit(1);

        if (delete.equals("Y")) {
            playerList.clear();
            System.out.print(playerList.toString());
        }

        //remove player from list
        System.out.println("\n" + "Which player would you like deleted from the list: (Enter player's name) ");
        String deleteName = input.nextLine();

        for (int i = 0; i < playerList.size() - 1; i++)
            if (playerList.equals(deleteName)) {
                playerList.clear();
            }
        System.out.print(playerList.toString());

    }
}

