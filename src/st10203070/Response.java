/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package st10203070;

/**
 *
 * @author maxgw
 */
public class Response
{
    String response = "I see you there";
    public String returnResponse()
    {
        return response;
    }

    public int calculateNumResponses(int initialResponseCount, int newResponses)
    {  
        int totalResponses = initialResponseCount + newResponses;

        return totalResponses;
    }
}
