package game;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.Path;
import java.util.Scanner;
import java.util.Stack;

import cards.*;
import spaces.*;

public class Board {
	
	private static Space[] SPACES = {
		new BranchSpace(1, "START COLLEGE (Borrow $40,000) or START CAREER", null, 13)
	};
	
	private static Career[] CAREERS = {
			
	};
	
	private static Salary[] SALARIES = {
			
	};
	
	private static Deed[] DEEDS = {
			
	};
	
	private static LIFE[] TILES = {
			
	};
	
	private Space[] spaces;
	private Player[] players;
	private CardStack<Career> careerDeck;
	private CardStack<Salary> salaryDeck;
	private CardStack<Deed> deedDeck;
	private CardStack<LIFE> tileDeck;

	//Future
	/* 
	 * private SpaceColor color;
	 * private LIFEIcon icon1;
	 * private STOPIcon icon2;
	 * private ARROWIcon icon3;
	 * private ARROWIcon icon4;
	 * private CAREERIcon icon5;
	 */

	public Board(Player[] players) {
		super();
		this.players = players;
		spaces = SPACES;
		careerDeck = new CardStack<>(CAREERS);
		salaryDeck = new CardStack<>(SALARIES);
		deedDeck = new CardStack<>(DEEDS);
		tileDeck = new CardStack<>(TILES);
		
	}

	public Space[] createBoard() {
		Space[] tempSpaces = new Space[BOARD_SIZE];
		try(Scanner in = new Scanner(new FileReader(FILE_NAME))) {
			int i = 0;
			while(in.hasNextLine() || i < BOARD_SIZE) {
				String line = in.nextLine();
				Scanner scan = new Scanner(line);
				scan.useDelimiter(", ");
				String text = scan.next();
				int branch = scan.nextInt();
				int affectedFunds = scan.nextInt();
				int instructionCode1 = scan.nextInt();
				int instructionCode2 = scan.nextInt();
				int instructionCode3 = scan.nextInt();
				tempSpaces[i] = new Space(text, branch, affectedFunds, instructionCode1, instructionCode2, instructionCode3);
				scan.close();
				i++;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		return tempSpaces;
	}

	public void playerDoesEvent(Player p, int spaceNum) {
		
	}
}
