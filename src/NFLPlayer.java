/**
 * Created by scott_000 on 9/11/2016.
 */

public class NFLPlayer {
    String name;
    long dateOfBirth;
    String teamName;
    String conference;
    double passingYards;
    double rushingYards;
    double receivingYards;
    int tackles;
    int sacks;
    int interceptions;
    private java.util.Date dateCreated;



    NFLPlayer() {

    }

    NFLPlayer(String x, long y) {
        name = x;
        dateOfBirth = y;
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

    public java.util.Date getDateCreated() {
        dateCreated = new java.util.Date();
        return dateCreated;
    }

}


