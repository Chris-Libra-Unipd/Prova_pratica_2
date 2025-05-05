////////////////////////////////////////////////////////////////////
 // [Davide] [Lorenzon] [2 101 075] 
 // [Christian] [Libralato] [ 2 101 047] 
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;  
  
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test; 
  

public class RomanLettersTest {
         /** 
      * Rigorous Test :-) 
      */ 
      @Test 
      public void shouldAnswerWithTrue() 
      { 
          assertTrue( true ); 
      } 

      @Test
      public void testGetAsciiArtForI() {
          String[] expected = {
              " _____ ",
              "|_   _|",
              "  | |  ",
              "  | |  ",
              " _| |_ ",
              "|_____|"
          };


        assertArrayEquals(expected, RomanLetters.I.getAsciiArt());
    }

    @Test
    public void testGetAsciiArtForV() {
        String[] expected = {
            "__      __  ",
            "\\ \\    / /",
            " \\ \\  / / ",
            "  \\ \\/ /  ",
            "   \\  /    ",
            "    \\/     "
        };
        assertArrayEquals(expected, RomanLetters.V.getAsciiArt());
    }

    @Test
    public void testFromCharValid() {
        assertEquals(RomanLetters.I, RomanLetters.fromChar('I'));
        assertEquals(RomanLetters.V, RomanLetters.fromChar('V'));
        assertEquals(RomanLetters.X, RomanLetters.fromChar('X'));
        assertEquals(RomanLetters.L, RomanLetters.fromChar('L'));
        assertEquals(RomanLetters.C, RomanLetters.fromChar('C'));
        assertEquals(RomanLetters.D, RomanLetters.fromChar('D'));
        assertEquals(RomanLetters.M, RomanLetters.fromChar('M'));
    }

    @Test
    public void testFromCharInvalid() {
        assertNull(RomanLetters.fromChar('A'));
        assertNull(RomanLetters.fromChar('1'));
        assertNull(RomanLetters.fromChar(' '));
        assertNull(RomanLetters.fromChar('@'));
    }

    @Test
    public void testEnumValues() {
        RomanLetters[] values = RomanLetters.values();
        assertEquals(7, values.length);
        assertEquals(RomanLetters.I, values[0]);
        assertEquals(RomanLetters.V, values[1]);
        assertEquals(RomanLetters.X, values[2]);
        assertEquals(RomanLetters.L, values[3]);
        assertEquals(RomanLetters.C, values[4]);
        assertEquals(RomanLetters.D, values[5]);
        assertEquals(RomanLetters.M, values[6]);
    }

    @Test
    public void testAllLettersHaveSameHeight() {
        for (RomanLetters letter : RomanLetters.values()) {
            assertEquals("Letter " + letter.name() + " has wrong number of lines",
                6, letter.getAsciiArt().length);
        }
    }

    @Test
    public void testNoEmptyLines() {
        for (RomanLetters letter : RomanLetters.values()) {
            for (String line : letter.getAsciiArt()) {
                assertFalse("Empty line found in " + letter.name(),
                    line.trim().isEmpty());
            }
        }
    }
}





