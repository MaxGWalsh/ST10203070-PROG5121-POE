package st10203070;

/**
 *
 * @author maxgw
 */
public class Message
{
    String returnMessage = "I have arrived";

    public String getMessage()
    {
        return returnMessage;
    }

    public boolean checkMessageFormat()
    {
        boolean valid = false;

        if(returnMessage.length()>20 || returnMessage.contains("@#$$%%^"))
        {
            valid = false;
        }
        else
        {
            valid = true;
        }
        return valid;
    }

    public String checkNum(int num)
    {
        String returnValue = null;
        if(num > 5)
        {
            returnValue = "PLease do not exceed 5";
        }
        else
        {
            returnValue = "Perfect numbers";
        }

       return returnValue;
    }

}
