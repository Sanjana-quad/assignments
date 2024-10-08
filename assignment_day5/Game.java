package assignment_day5;

public class Game {
    public String name;
    public int MaxNumPlayers;
    public Game(String name, int MaxNumPlayers) {
        this.name = name;
        this.MaxNumPlayers = MaxNumPlayers;
    }
    public String ToString() {
        return "Maximum number of players for "+ this.name + " is " + this.MaxNumPlayers ;
    }
}

class GameWithTimeLimit extends Game {
    public int TimeLimit;

    public GameWithTimeLimit(String name, int MaxNumPlayers, int TimeLimit) {
        super(name, MaxNumPlayers);
        this.TimeLimit = TimeLimit;
    }
    @Override
    public String ToString() {
        return "Maximum number of players for " + this.name + " is " + this.MaxNumPlayers + "\n"+ "Time Limit for " +this.name+" is "+ this.TimeLimit+" minutes.";
    }
}

class Program{
    public static void main(String[] args) {
        Game game = new Game("Cricket", 11);
        System.out.println(game.ToString());
        GameWithTimeLimit gameWithTimeLimit = new GameWithTimeLimit("Football", 11,90);
        System.out.println(gameWithTimeLimit.ToString());
    }
}