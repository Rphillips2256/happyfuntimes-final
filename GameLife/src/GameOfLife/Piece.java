package GameOfLife;

import java.io.Serializable;

public class Piece implements Serializable{
	private Square location;
	
	public Piece(Square location) {
		this.location = location;
	}
	
	public Square getLocation() {
		return location;
	}
	
	public void setLocation(Square location) {
		this.location=location;
	}
}
