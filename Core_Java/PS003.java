
public class PS003 {

    
    private String name;
    private int wickets;
    private int matches;
    private int balls_bowled;
    private int runs_conceded;

    public PS003() {
        this.name = "Unknown";
        this.wickets = 0;
        this.matches = 0;
        this.balls_bowled = 0;
        this.runs_conceded = 0;
    }

    public PS003(String name, int wickets, int matches, int balls_bowled, int runs_conceded) {
        this.name = name;
        this.wickets = wickets;
        this.matches = matches;
        this.balls_bowled = balls_bowled;
        this.runs_conceded = runs_conceded;
    }

    public void computeBowlingAverage() {
        if (wickets == 0) {
            System.out.println("Bowling average cannot be calculated as wickets are zero.");
        } else {
            double bowlingAverage = (double) runs_conceded / wickets;
            System.out.println("Bowling Average: " + bowlingAverage);
        }
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWickets() {
        return wickets;
    }

    public void setWickets(int wickets) {
        this.wickets = wickets;
    }

    public int getMatches() {
        return matches;
    }

    public void setMatches(int matches) {
        this.matches = matches;
    }

    public int getBalls_bowled() {
        return balls_bowled;
    }

    public void setBalls_bowled(int balls_bowled) {
        this.balls_bowled = balls_bowled;
    }

    public int getRuns_conceded() {
        return runs_conceded;
    }

    public void setRuns_conceded(int runs_conceded) {
        this.runs_conceded = runs_conceded;
    }

    public static void main(String[] args) {
        PS003 bowler1 = new PS003("James Anderson", 600, 160, 20000, 15000);
        bowler1.computeBowlingAverage();

        PS003 bowler2 = new PS003();
        bowler2.computeBowlingAverage();
    }
}