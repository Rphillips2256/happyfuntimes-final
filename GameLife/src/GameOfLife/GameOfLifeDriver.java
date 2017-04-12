package GameOfLife;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import logic.TakeTurnObserver;
import logic.Spin;
import logic.SpinObserver;
public class GameOfLifeDriver {

	private static TakeTurnObserver turnObserver = null;
	 private static List<SpinObserver> spinObservers = new ArrayList<SpinObserver>(); 

	static Scanner console = new Scanner(System.in);

	public static void main(String[] args) {
		LifeGame game = null;
		Spin spinner = null;
		StringBuilder menuOutput = new StringBuilder();
		menuOutput.append("\nWelcome to Monopoly Simulator!\n");
		menuOutput.append("\nEnter: \n1 New game");
		menuOutput.append("\n0 Exit\n\n");
		boolean gameFlag = true;
		while(gameFlag) {
			System.out.print(menuOutput.toString());
			int input=console.nextInt();
			switch(input) {
			case 1:
				spinObservers.clear();
				game = new LifeGame();
				turnObserver = new TakeTurnObserver(game);
				spinner= game.getVaule();
				
				game.playGame();
				game = null;
				break;
				
			case 0:
				gameFlag=false;
				break;

			default:
				System.out.println("Invalid Input. Please try again!");
			}
		}
		System.out.println("Thank you for using the Game of Life Simulator!");
	}


}
