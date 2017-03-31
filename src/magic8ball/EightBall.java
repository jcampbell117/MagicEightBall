
package magic8ball;

import java.security.SecureRandom;

/**
 *
 * @author jcamp
 */
public class EightBall {
    private String[] responses;
    
    public EightBall (){
        setResponses();
    }
    
    /**
     * This method sets all the possible entries in the
     * responses instance variable
     */
    private void setResponses()
    {
        responses = new String[20];
        responses[0] = "It is certain";
        responses[1] = "It is decidedly so";
        responses[2] = "Without a doubt";
        responses[3] = "Yes, definitely";
        responses[4] = "You may rely on it";
        responses[5] = "As I see it, yes";
        responses[6] = "Most likely";
        responses[7] = "Outlook good";
        responses[8] = "Yes";
        responses[9] = "Signs point to yes";
        responses[10] = "Reply hazy try again";
        responses[11] = "Ask again later";
        responses[12] = "Better not tell you now";
        responses[13] = "Cannot predict now";
        responses[14] = "Concentrate and ask again";
        responses[15] = "Don't count on it";
        responses[16] = "My reply is no";
        responses[17] = "My sources say no";
        responses[18] = "Outlook not so good";
        responses[19] = "Very doubtful";
    }
    
    /**
     * This method randomly selects a response from 
     * the responses array and returns it as a String
     */
    public String getResponse() {
        SecureRandom die1 = new SecureRandom();
        
        return responses[die1.nextInt(20)];
    }
}
