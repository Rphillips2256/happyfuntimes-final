package test;

import org.junit.Test;

import edu.lifeGame.logic.Board;
import edu.lifeGame.logic.Player;
import edu.lifeGame.logic.Spin;
import edu.lifeGame.logic.Square;

public class PlayerTest {

  @Test
  public void testTakeTurn() {

    Board board = Board.getInstance();
    Spin spin = new Spin();
    Player player = new Player("Test1", board, spin);
    player.takeTurn();
    
    Square square = player.getLocation();
    System.out.println(square);
  }
  
}
