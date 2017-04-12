package logic;


import java.util.Observable;
import java.util.Observer;

public class SpinObserver implements Observer{
    private Observable publisher;
    
    // default constructor
	public SpinObserver () {
	}
	
	// constructor with die total
	public SpinObserver (Observable o) {
		publisher = o;
		publisher.addObserver(this);
	}
	
	public void setRollTotal(Observable o) {
		publisher = o;
	}
	
	@Override
	public void update(Observable o, Object arg) {
		// subscriber can check which publisher notifying
			System.out.println("Observer 2 observes die total: " + arg.toString());
	}
    
}
