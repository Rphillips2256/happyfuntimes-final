package GameOfLife;

public class Spinner {
	
	public int spin;
	
	public int doesSpin(){
		
		spin = (int) (Math.random() * 10 + 1);
		
		return spin;
		
	}

}
