package game;
import cards.Career;
import cards.Deed;
import cards.LIFE;
import cards.Salary;
import cards.Stock;
import spaces.Space;

public class Player {
	
	private String name;
	private int funds;
	private int loanCount;
	private int peopleCount;
	private boolean hasDegree;
	private boolean hasAutoIns;
	private boolean hasHomeIns;
	private Career career;
	private Salary salary;
	private Deed deed;
	private Stock stock1;
	private Stock stock2;
	private LIFE tiles;
	
	private int movesLeft;
	private Space occSpace;
	private boolean skipNextTurn;
	
	public Player(String name) {
		this.name = name;
	}
	
	public Space getOccSpace() {
		return occSpace;
	}
	
	public boolean chooseBranch() {
		return true;
	}
	
	public boolean chooseAction() {
		return true;
	}
	
}
