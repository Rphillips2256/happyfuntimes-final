package GameOfLife;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Observable;

import logic.Board;
import logic.Spin;
import logic.Player;
import logic.Career;
import logic.Salary;
import logic.TurnInfo;
public class LifeGame extends Observable{

	private static final int ROUNDS_TOTAL=20;
	private static final int PLAYERS_TOTAL=2;
	private List players = new ArrayList(PLAYERS_TOTAL);
	Board board;
	Spin spinner = new Spin();   
	private int round =0;
	private boolean gameFlag = true;
	Career career;
	Player p;
	Salary salary;

	public LifeGame() {
		players.clear();
		
		p=new Player("Player1",board, spinner);
		players.add(p);
		p=new Player("Player2",board,spinner);
		players.add(p);
	}


	public LifeGame(TurnInfo info) {
		players.clear();
		round = info.getRoundNumber();
		Player p;
		p=new Player("Player1",board,spinner,info.getPlayer1Position());
		players.add(p);
		p=new Player("Player2",board,spinner,info.getPlayer2Position());
		players.add(p);
	}

	public void playGame() {
		//spinner = new Spin();
		
		for(int i = 0; i<players.size();i++){
			spinner = new Spin();
			p = (Player) players.get(i);
			spinner = new Spin();
			career.Spin(p);
			spinner = new Spin();
			salary.returnSalary(p);
			
			
		}
		for(;round<ROUNDS_TOTAL; round++) {
			if(round ==1){
				p.setLocation(board.getStartSquare()); 
			}
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
	
	public Spin getVaule() {
		return spinner;
	}
	
}