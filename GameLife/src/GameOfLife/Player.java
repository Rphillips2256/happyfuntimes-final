package GameOfLife;

//This is a change so ha, it is a comment
//comment 2


import java.io.Serializable;

public class Player implements Serializable {
	private String name;
	private Piece piece;
	private Board board;
	
	public Player(String name,  Board board) {
		this.name=name;
		this.board=board;
		piece = new Piece(board.getStartSquare());
	}
	
	public Player(String name, Board board, int position) {
		this.name=name;
		this.board=board;
		Square square = board.getStartSquare();
		for(int i=0; i<=position; i++) {
			square=square.getNextSquare();
		}
		piece = new Piece(square);
	}
	
	public void takeTurn() {
			//roll dice
		

		//Square newLoc = board.getSquare(piece.getLocation());//need spin number
		//piece.setLocation(newLoc);
	}
	
	public Square getLocation() {
		return piece.getLocation();
	}
	
	public String getName() {
		return name;
	}
}