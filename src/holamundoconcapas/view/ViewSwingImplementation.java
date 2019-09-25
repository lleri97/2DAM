/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundoconcapas.view;


import javax.swing.JOptionPane;

/**
 *
 * @author Yeray
 * At this class we create a window with JOptionPane to show the greeting
 */
public class ViewSwingImplementation implements View {

    /**
     *
     * @param greeting
     */
    @Override
   public void showGreeting(String greeting){
       JOptionPane.showMessageDialog(null, greeting);
   }
   
    
}
