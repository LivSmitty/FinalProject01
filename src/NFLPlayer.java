import java.util.*;
import java.lang.String.*;
import static java.util.Arrays.*;

/**
 * Created by scott_000 on 9/11/2016.
 */

public class NFLPlayer implements Celebrator {
    int playerKey;
    public String name;
    public String dateOfBirth;
    public String teamName;
    public String conference;
    public String playerType;
    public double passingYards;
    public double rushingYards;
    public double receivingYards;
    public double sacks;
    public double tackle;
    public double interceptions;
    public ArrayList<String> playerArray = new ArrayList<String>();




    private java.util.Date dateCreated;



    NFLPlayer() {

    }

    NFLPlayer(String name, String DOB, String playerType, String teamName, String conference, double passingYards, double rushingYards,
       double receivingYards, double sacks, double tackle, double interceptions ) {
        this.playerKey = playerKey;
        this.name = name;
        this.dateOfBirth = DOB;
        this.playerType = playerType;
        this.teamName = teamName;
        this.conference = conference;
        this.passingYards = passingYards;
        this.rushingYards = rushingYards;
        this.receivingYards = receivingYards;
        this.sacks = sacks;
        this.tackle = tackle;
        this.interceptions = interceptions;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String i) {
        teamName = i;
    }

    public String getConference() {
        return conference;
    }

    public void setConference(String i) {
        conference = i;
    }









    public static void formatOutput(){
        System.out.print("Name"+ "                " + "DOB        " + "Off/Def          " + "Team             " + "Conference     " +
        "Pass Yds      " + "Rush Yds    " + "Rec. Yds     " + "Sacks      " + "Tkls        " + "Int        ");


    }



    @Override
    public String toString() {
        return "\n" + name + "     " + dateOfBirth + "       " + playerType + "      " + teamName + "      " + conference + "      " + passingYards
                + "      " + rushingYards + "      " + receivingYards + "      " + sacks + "      " + tackle + "      " + interceptions;

    }





    public java.util.Date getDateCreated() {
        dateCreated = new java.util.Date();
        return dateCreated;
    }

    @Override
    public void celebrate() {
        //Create array of reactions
        String[] celebrate = new String[]{"dances", "sings", "jumps", "shouts", "spins"};

        //Generate and print random reaction
        int idx = new Random().nextInt(celebrate.length);
        String random = (celebrate[idx]);
        System.out.println(name + " " + random + " to celebrate his draft.");

    }



}

class OffensivePlayer extends NFLPlayer implements Celebrator {
    double passingYards;
    double rushingYards;
    double receivingYards;



    public double getPassingYards() {
        return passingYards;
    }

    public void setPassingYards(double i) {
        passingYards = i;
    }

    public double getRushingYards() {

        return rushingYards;
    }

    public void setRushingYards(double i) {
        rushingYards = i;
    }

    public double getReceivingYards() {
        return receivingYards;
    }

    public void setReceivingYards(double i) {
        receivingYards = i;
    }


    @Override
    public void celebrate() {
        //Create array of reactions
        String[] celebrate = new String[]{"dances", "sings", "jumps", "shouts", "spins"};

        //Randomly generate and print reaction
        int idx = new Random().nextInt(celebrate.length);
        String random = (celebrate[idx]);
        System.out.println(name + " " + random + " to celebrate his draft.");

    }
}

class DefensivePlayer extends NFLPlayer implements Celebrator{
    int sacks;
    int tackles;
    int interceptions;
    double averageSacks;
    double averageTackles;




    public int getTackles() {
        return tackles;
    }

    public void setTackles(int i) {
        tackles = i;
    }

    public int getSacks() {
        return sacks;
    }

    public void setSacks(int i) {
        sacks = i;
    }

    public int getInterceptions() {
        return interceptions;
    }

    public void setInterceptions(int i) {
        interceptions = i;
    }

    public double getAverageSacks(int sacks){
        Scanner input = new Scanner(System.in);
        System.out.println("How many games has he played this season? ");
        int numberOfGames = input.nextInt();
        averageSacks = sacks/numberOfGames;
        return averageSacks;
    }

    public double getAverageTackles(int tackles){
        Scanner input = new Scanner(System.in);
        System.out.println("How many games has he played this season? ");
        int numberOfGames = input.nextInt();
        averageTackles = tackles/numberOfGames;
        return averageTackles;
    }

    public void celebrate(){
        //Create array of reactions
        String[] celebrate = new String[]{"dances", "sings", "jumps", "shouts", "spins"};

        //Get and print random reaction
        int idx = new Random().nextInt(celebrate.length);
        String random = (celebrate[idx]);
        System.out.println(name + " " + random + " to celebrate his draft.");
    }

}

