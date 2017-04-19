package logic;




import java.io.Serializable;

public class Player implements Serializable {
	private String name;
	private int playerOrder;
	private double salary;
	private String career;
	private Board board;//
	private Square location = null; //
	private Spin spin;
	//private Square newLoc;
	private double income;
	private int rollTotal = 5;
	
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
	
	public Player(String name){
		this.name = name;
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
		//int rollTotal = 5;
		//rollTotal = spin.spinner();
	
		Square newLoc = board.getSquare(getLocation(), rollTotal);
		location = newLoc;
	}
	
	public Square getLocation() {
		return location;
	}
	
	public String getName() {
		return name;
	}
	public Square setLocation(Square square) {
		return location;
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