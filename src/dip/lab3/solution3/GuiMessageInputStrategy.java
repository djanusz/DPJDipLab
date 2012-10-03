/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.solution3;

import java.util.HashSet;
import javax.swing.JOptionPane;

/**
 *
 * @author David
 */
public class GuiMessageInputStrategy implements MessageSourceStrategy{
    private String message;
    private String msgRequest = "Please type a message.";
            
    public Message getMessage() {
        message = JOptionPane.showInputDialog(msgRequest);
        Message msg = new Message(message);
        return msg;
          
    }
}
