package test;

import org.junit.Assert;
import org.junit.Test;

import edu.lifeGame.logic.Square;
import edu.lifeGame.logic.SquareFactory;

public class SquareFactoryTest {

  @Test
  public void testCreate() {
    SquareFactory factory = new SquareFactory();
    
    Square square = factory.create(0);
    Assert.assertEquals("Orange0", square.getName());
    Assert.assertEquals(-1, square.getIndex());
  }
}
