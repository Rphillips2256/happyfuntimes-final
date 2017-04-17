package test;

import org.junit.Assert;
import org.junit.Test;

import edu.lifeGame.logic.Board;
import edu.lifeGame.logic.Square;

public class BoardTest {

  @Test
  public void testGetSquare() {
    
    Board board = Board.getInstance();
    
    Square square = new Square("Something", 0);
    Square actualSquare = board.getSquare(square, 4);
    
    Assert.assertEquals("Green4", actualSquare.getName());
    Assert.assertEquals(3, actualSquare.getIndex());
  }
  
  @Test
  public void testGetStartSquare() {
    
    Board board = Board.getInstance();
    
    Square actualSquare = board.getStartSquare();
    
    Assert.assertEquals("Green1", actualSquare.getName());
    Assert.assertEquals(0, actualSquare.getIndex());
  }
}
