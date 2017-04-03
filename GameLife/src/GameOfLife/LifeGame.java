package GameOfLife;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Observable;

import logic.Board;
import logic.Player;
import logic.TurnInfo;

public class LifeGame extends Observable implements Serializable{

	private static final int ROUNDS_TOTAL=20;
	private static final int PLAYERS_TOTAL=2;
	private List players = new ArrayList(PLAYERS_TOTAL);
	private Board board = Board.getInstance();
	
	private int round =0;
	private boolean gameFlag = true;



	public LifeGame() {
	
	}

	public LifeGame(TurnInfo info) {
		players.clear();
	
	}

	public void playGame() {
		for(;round<ROUNDS_TOTAL; round++) {
			playRound();
			setChanged();
			notifyObservers(this);
			if(!gameFlag) {
				round++;
				gameFlag=true;
				break;
			}
		}
	}

	public List getPlayers() {
		return players;
	}

	private void playRound() {
		for(Iterator iter = players.iterator(); iter.hasNext();) {
			Player player = (Player) iter.next();
			player.takeTurn();
		}
	}
	
	public void setGameFlag(boolean flag){
		gameFlag = flag;
	}
	
	public int getRound(){
		return round;
	}
	

}
