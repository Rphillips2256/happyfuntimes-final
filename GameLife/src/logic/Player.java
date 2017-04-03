package logic;




import java.io.Serializable;

public class Player implements Serializable {
	private String name;
	private int playerOrder;
	private double salary;
	private String career;
	private Board board;//
	private Square location; //
	private Spin spin;
	private Square newLoc;
	
	public Player(String name, Board board, int position, int playerOrder, double salary, String career, Square location) {
		this.name=name;
		this.board=board;
		this.playerOrder = playerOrder;
		this.salary = salary;
		this.career = career;
		this.location = location;
	}

	public void takeTurn() {
		//spin//
	  spin.spinner();
	 newLoc = board.getSquare(getLocation(), spin.spinner());
	}
	
	public Square getLocation() {
		return location;
	}
	
	public String getName() {
		return name;
	}
	public Square setLocation() {
		return newLoc;
	}//
}