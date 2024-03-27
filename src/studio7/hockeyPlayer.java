package studio7;

public class hockeyPlayer {
	private String name;
	private int jerseyNumber;
	private int goals;
	private int assists;
	private int points;
	private int numGames;

	public hockeyPlayer(String name, int jerseyNumber) {
		this.name=name;
		this.jerseyNumber=jerseyNumber;
		this.goals=0;
		this.assists=0;
		this.points=0;
		this.numGames=0;
	}
	
	public String completeGame () {
		return "goals:" + goals + "assists:" + assists + "points:" + points;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
