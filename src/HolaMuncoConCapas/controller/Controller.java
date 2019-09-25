/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HolaMuncoConCapas.controller;

import holamundoconcapas.model.Model;
import holamundoconcapas.view.View;
import java.util.logging.Logger;

/**
 *Esta clase junta la vista con el modelo 
 * 
 * @author Yeray
 * @param vista el objeto vista
 * @param modelo el objeto modelo
 */
public class Controller {
    private static final Logger LOGGER=Logger.getLogger("HolaMuncoConCapas.controller.Controller") ;
    
    public void run(View vista,Model modelo){
        LOGGER.info("Starting run method");
     vista.showGreeting(modelo.getGreeting());
        LOGGER.info("Run method finished");
    }
    
}
