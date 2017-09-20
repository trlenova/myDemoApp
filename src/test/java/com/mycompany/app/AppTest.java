package com.mycompany.app;
import java.util.*;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
   public void testFound() {
      ArrayList<String> array = new ArrayList<>(Arrays.asList("haber","bero","ahyberuy","yberaasas"));
      assertTrue(new App().search(array,"ber",4));
    }

    public void testNotFound() {
      ArrayList<String> array = new ArrayList<>(Arrays.asList("haber","bero","ahyberuy","yberaasas"));
      assertFalse(new App().search(array,"ber",3));
    }

    public void testEmptyArray() {
      ArrayList<String> array = new ArrayList<>();
      assertFalse(new App().search(array,"ber",3));
    }

    public void testEmptyHece() {
      ArrayList<String> array = new ArrayList<>(Arrays.asList("haber","bero","ahyberuy","yberaasas"));
      assertFalse(new App().search(array,null,1));
    }
     public void testIntBad() {
      ArrayList<String> array = new ArrayList<>(Arrays.asList("haber","bero","ahyberuy","yberaasas"));
      assertFalse(new App().search(array,"ber",-1));
    }

}
