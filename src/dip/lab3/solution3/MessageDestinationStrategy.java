/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.solution3;

/**
 *
 * @author David
 */
public interface MessageDestinationStrategy {
    public abstract void sendMessage(MessageSourceStrategy inputMessage);
}
