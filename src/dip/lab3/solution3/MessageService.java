/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.solution3;

/**
 *
 * @author David
 */
public class MessageService {
    private MessageSourceStrategy input;
    private MessageDestinationStrategy output;
    
    public MessageService(MessageSourceStrategy inputMessage, 
            MessageDestinationStrategy outputMessage) {
        input = inputMessage;
        output = outputMessage;
    }
    
    public void sendMessage() {
        output.sendMessage(input);
    } 
}
