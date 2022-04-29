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
    
}
