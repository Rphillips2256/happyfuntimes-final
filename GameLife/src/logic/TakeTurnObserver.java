package logic;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JOptionPane;
import GameOfLife.LifeGame;

public class TakeTurnObserver implements Observer{
	private Observable publisher;
	private LifeGame game;
	
	public TakeTurnObserver() {
		
	}
	
	public TakeTurnObserver(Observable publisher) {
		this.publisher=publisher;
		publisher.addObserver(this);
	}

	@Override
	public void update(Observable o, Object arg) {
		game = (LifeGame) arg;
		List<Integer> positions = new ArrayList<Integer>();
		List<Player> players = game.getPlayers();
		for(Iterator iter = players.iterator(); iter.hasNext();) {
			Player player = (Player) iter.next();
			positions.add(player.getLocation().getIndex());
		}
		TurnInfo info = new TurnInfo();
		info.setRoundNumber(game.getRound());
		info.setPlayer1Position(positions.get(0));
		info.setPlayer2Position(positions.get(1));
		String message = "Round: " + info.getRoundNumber() + 
						"\nPlayer1 Position: " + info.getPlayer1Position() +
						"\nPlayer2 Position: " + info.getPlayer2Position() + 
						"\nContinue Game?";
		String title = "Turn Results";
		int reply = JOptionPane.showConfirmDialog(null, message, title, JOptionPane.YES_NO_OPTION);
		if(reply == JOptionPane.YES_OPTION) {
			
		}
		else {
			game.setGameFlag(false);
		}
	}
}
