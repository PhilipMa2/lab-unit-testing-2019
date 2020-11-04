package csc207.testing;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class RemoveBTest {
    
    @Test
    void testRemoveBs() {
        String test = "bbbbccccbbbb";
        assertEquals("cccc", SampleMethods.removeBs(test), "beginning and end b");
        
    }

    @Test
    public void testRemoveBs2() {
        assertEquals("", 
                     SampleMethods.removeBs(""),
                     "empty string");
        assertEquals("hello", 
                     SampleMethods.removeBs("hello"),
                     "no bs");
        assertEquals("", 
                     SampleMethods.removeBs("b"),
                     "eliminate one b");
        assertEquals("", 
                     SampleMethods.removeBs("bbbb"),
                     "eliminate many bs");
        assertEquals("pin", 
                     SampleMethods.removeBs("pbin"),
                     "eliminate one b, short string");
        assertEquals("alphaet", 
                     SampleMethods.removeBs("alphabbet"),
                     "eliminate many bs, medium string");
        assertEquals("BCDEFGHIJKLMNOPQ",
                     SampleMethods.removeBs("bBbCDbbbEFGbHIJKbbbLMNbOPbQbb"),
                     "eliminate many bs, silly string");
        assertEquals("aaaaaa",
                     SampleMethods.removeBs("aaabbbaaa"),
                     "eliminate prefix and suffix as");
      } // testRemoveAs
}

