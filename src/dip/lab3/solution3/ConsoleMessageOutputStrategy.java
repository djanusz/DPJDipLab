/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.solution3;

/**
 *
 * @author David
 */
public class ConsoleMessageOutputStrategy implements MessageDestinationStrategy {

    public void sendMessage(MessageSourceStrategy inputMessage) {
        Message msg = inputMessage.getMessage();
        System.out.println(msg);
    }
    
}
