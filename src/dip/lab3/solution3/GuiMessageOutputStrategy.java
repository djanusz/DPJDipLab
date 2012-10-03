/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.solution3;

import javax.swing.JOptionPane;

/**
 *
 * @author David
 */
public class GuiMessageOutputStrategy implements MessageDestinationStrategy {

    public void sendMessage(MessageSourceStrategy inputMessage) {
        Message msg = inputMessage.getMessage();
        JOptionPane.showMessageDialog(null, msg.getMessage());
    }
    
}
