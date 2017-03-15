package GameOfLife;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Board implements Serializable{
	private static final int SIZE = 100;
	private List squares = new ArrayList(SIZE);
	private SquareFactory sqFactory = new SquareFactory();
	private static Board instance;
	
        
        private Board() {
		buildSquares();
		linkSquares();
	}
        
        public static Board getInstance(){
            if(instance==null){
                instance = new Board();
            }
            return instance;
        }
	
	public Square getSquare(Square start, int distance) {
		int endIndex = (start.getIndex() + distance) % SIZE;
		return (Square) squares.get(endIndex);
	}
	
	public Square getStartSquare() {
		return (Square) squares.get(0);
	}
	
	private void buildSquares() {
		for(int i=1; i<=SIZE; i++) {
			build(i);
		}
	}
	
	private void build(int i) {
		Square s = (Square) sqFactory.createSquare(i);
		squares.add(s);
	}
	
	private void linkSquares() {
		for(int i=0; i<(SIZE-1); i++) {
			link(i);
		}
		Square first = (Square) squares.get(0);
		Square last = (Square) squares.get(SIZE - 1);
		last.setNextSquare(first);
	}
	
	private void link(int i) {
		Square current = (Square) squares.get(i);
		Square next = (Square) squares.get(SIZE-1);
		current.setNextSquare(next);
	}
}
