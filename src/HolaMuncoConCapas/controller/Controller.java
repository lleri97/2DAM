/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HolaMuncoConCapas.controller;

import holamundoconcapas.model.Model;
import holamundoconcapas.view.View;

/**
 *
 * @author Yeray
 */
public class Controller {
    
    public void run(View vista,Model modelo){
     vista.showGreeting(modelo.getGreeting());
    }
    
}
