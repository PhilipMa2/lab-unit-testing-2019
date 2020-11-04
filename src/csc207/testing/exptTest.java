package csc207.testing;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class exptTest {

  @Test
  void testExptIntInt() {
    assertEquals(1024, SampleMethods.expt(2, 10), "1K");
    int expected = 1;
    for (int pow = 0; pow < 20; pow++) {
      assertEquals(expected, SampleMethods.expt(2, pow), "base 2 test");
      expected *= 2;
    }
    expected = 1;
    for (int pow = 0; pow < 20; pow++) {
      assertEquals(expected, SampleMethods.expt(-2, pow), "base -2 test");
      expected *= -2;
    }
  }

  @Test
  void testExptDoubleInt() {
    double expected = 1;
    for (int pow = 0; pow < 20; pow++) {
      assertEquals(expected, SampleMethods.expt(1.5, pow), "base 1.5 test");
      expected *= 1.5;
    }
    expected = 1;
    for (int pow = 0; pow < 20; pow++) {
      assertEquals(expected, SampleMethods.expt(-1.5, pow), "base -1.5 test");
      expected *= -1.5;
    }
  }

}
