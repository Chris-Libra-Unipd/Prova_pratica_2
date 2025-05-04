//////////////////////////////////////////////////////////////////// 
 // [Davide] [Lorenzon] [2 101 075] 
 // [Christian] [Libralato] [ 2 101 047] 
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;  
  
 import static org.junit.Assert.assertEquals;
 import static org.junit.Assert.assertTrue;
 import org.junit.Test; 
  
 /** 
  * Unit test for simple App. 
  */ 
 public class RomanPrinterTest  
 { 
     /** 
      * Rigorous Test :-) 
      */ 
     @Test 
     public void shouldAnswerWithTrue() 
     { 
         assertTrue( true ); 
     } 
     
     @Test 
     public void test_123(){
        String expected=
        "  _____  __   __ __   __  _____  _____  _____ \n"+
        " / ____| \\ \\ / / \\ \\ / / |_   _||_   _||_   _|\n"+
        "| |       \\ V /   \\ V /    | |    | |    | |  \n"+
        "| |        > <     > <     | |    | |    | |  \n"+
        "| |____   / . \\   / . \\   _| |_  _| |_  _| |_ \n"+
        " \\_____| /_/ \\_ \\/_/  \\_\\|_____||_____||_____|\n";
        assertEquals(expected,RomanPrinter.print(123));
    }
 } 
  
 
