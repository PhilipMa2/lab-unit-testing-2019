package csc207.testing;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class sumTest {

  @Test
  void testSum() {
    int[] values = {1, 2, 3};
    assertEquals(6, SampleMethods.sum(values), "Summation of three variables");
    values[0] = 0;
    assertEquals(5, SampleMethods.sum(values), "Including zero");
  }
  
  @Test
  public void testExtremes() {
    int tmp = Integer.MAX_VALUE - 10;
    int[] values = {tmp, tmp, -tmp, -tmp};
    assertEquals(0, SampleMethods.sum(values), "extreme values");
  }

}
