package st10203070;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;
/**
 *
 * @author maxgw
 */
public class MessageTest 
{
    Message message = new Message();
    public MessageTest() 
    {
    }

    @Test
    public void testGetMessage()
    {
        String expected = "I have arrived";
        String actual = message.getMessage();

        assertEquals(expected,actual);
    }

    @Test
    public void testCheckMessageFormat()
    {
        assertTrue(message.checkMessageFormat());
    }

    @Test
    public void testCheckNumSuccess()
    {
        for (int i = 0; i < 3; i++)
        {
            String expected = "Perfect numbers";
            String actual = message.checkNum(i);
            assertEquals(expected,actual);
        }
    }
    
}
