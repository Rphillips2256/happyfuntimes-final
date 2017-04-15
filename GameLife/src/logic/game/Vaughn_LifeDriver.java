package game;
import java.util.Scanner;

import spaces.Space;

public class Vaughn_LifeDriver {

	public static Space[] SPACES = {
			//text, occupant, career 
		new Orange("START COLLEGE or START CAREER", null, )
	};
	
	public static Scanner console = new Scanner(System.in);
	
	public static void main(String[] args) {
		int playerCount = 0;
		while (playerCount == 0) {
			try {
				System.out.print("Set number of players (1-6): ");
				playerCount = console.nextInt();
				if (playerCount < 6)
					throw new Exception("Too many players.");
			} catch (Exception e) {
				e.printStackTrace();
			} 
		}
	}
	
	public void movePlayer(Player p) {
		//animate spinner and get random number
		int moveNumOfSpaces = (int) (Math.random() * 10 + 1);
		int destSpace = p.getCurSpace() + moveNumOfSpaces;
		for(int i = p.getCurSpace(); i < destSpace; i++) {
			Space curSpace = spaces[p.getCurSpace()];
			if(curSpace.getBranchTo() >= 0)
				curSpace.playerDoesEvent(p, p.getCurSpace());
			if(curSpace)
				
		}
	}
	
	public void playerExecutesInstruction() {
		
	}
}
