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
	private double income;
	
	public Player(String name, Board board, Spin spin){
		this.name = name;
		this.board = board;
		this.spin = spin;
	}
	public Player(String name, Board board, Spin spin, int position){
		this.name = name;
		this.board = board;
		this.spin = spin;
		Square square = board.getStartSquare();
		for(int i=0; i<=position; i++) {
			square=square.getNextSquare();
		}
		location = square;
	}
	/*
	public Player(String name, Board board,int position, double salary, String career, Square location) {
		this.name=name;
		this.board=board;
		this.salary = salary;
		this.career = career;
		this.location = location;
	}
*/
	public void takeTurn() {
		//spin//
	  spin.spinner();
	 //newLoc = board.getSquare(getLocation(), spin.spinner());
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
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getSalary() {
		return salary;
	}
	public void setIncome(double income) {
		this.income = income;
	}
	public double getIncome() {
		return income;
	}
	public void setCareer(String career) {
		this.career = career;
	}
	public String getCareer() {
		return career;
	}
}