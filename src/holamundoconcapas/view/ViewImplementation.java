/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundoconcapas.view;

/**
 *
 * @author Yeray
 * We show the greeting that we recived
 */
public class ViewImplementation implements View {
    
    @Override
    public void showGreeting(String greeting) {
        System.out.println(greeting);
}
}
