package epsi;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Test adding two numbers
     */
    @Test
    public void shouldAddTwoNumbers()
    {
        assertEquals("2 + 3 should be 5", 5, App.compute(new String[]{"2", "3"}));
    }
    /**
     * Test Multipky two numbers
     */
    @Test
    public void shouldMultiplyTwoNumbers()
    {
        assertEquals("2 * 3 should be 6", 6, App.multiply(new String[]{"2", "3"}));
    }
}
