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
public class Startup {
    public static void main(String[] args) {
       
        MessageSourceStrategy input = new RandomQuoteMessageInputStrategy();
        MessageDestinationStrategy output = new GuiMessageOutputStrategy();
        
        MessageService messageService = new MessageService(input, output);
        messageService.sendMessage();
    }
}
