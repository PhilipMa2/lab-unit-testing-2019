package csc207.testing;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class C2FTest {

  @Test
  void testC2f() {
    assertEquals(32, SampleMethods.c2f(0), "0 degree Celsius");
    assertEquals(212, SampleMethods.c2f(100), "100 degree Celsius");
  }

}
