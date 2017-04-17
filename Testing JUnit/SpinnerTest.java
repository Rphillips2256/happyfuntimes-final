package test;

import org.junit.Assert;
import org.junit.Test;

public class SpinnerTest {

  @Test
  public void testDoSpin() {
    Spinner spinner = new Spinner();
    
    for(int i= 1; i<=100; i++) {
      int actualResult = spinner.doesSpin();
      //System.out.println(actualResult);
      Assert.assertTrue(actualResult >= 1);
      Assert.assertTrue(actualResult <= 10);

    }
  }

}
