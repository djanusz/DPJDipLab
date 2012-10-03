/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.solution3;

import java.util.Random;

/**
 *
 * @author David
 */
public class RandomQuoteMessageInputStrategy implements MessageSourceStrategy {
    private Message[] msg = {
        new Message("We can't solve problems by using the same kind of "
            + "thinking we used when we created them."),
        new Message("Great spirits have always found violent opposition "
            + "from mediocrities."),
        new Message("Reality is merely an illusion, albeit a very "
            + "persistent one."),
        new Message("Everything should be made as simple as possible, "
            + "but not simpler.")
    };
            
    public Message getMessage() {
        Random random = new Random(System.nanoTime());
        int index = random.nextInt(msg.length);
        return msg[index];
    }
    
}
