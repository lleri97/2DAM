/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundoconcapas;

import HolaMuncoConCapas.controller.Controller;
import holamundoconcapas.model.ModelFactory;
import holamundoconcapas.view.viewFactory;
import java.util.logging.Logger;

/**
 *
 * @author Yeray
 * 
 * The main method to summon the application
 */
public class Application {
        private static final Logger LOGGER=Logger.getLogger("HolaMuncoConCapas.Application") ;
    
    
public static void main(String[] args){
        LOGGER.info("Start of method main");
    ModelFactory modelFactoria = new ModelFactory();
    viewFactory viewFactoria =new viewFactory();
    Controller controlador = new Controller();
    
  controlador.run(viewFactoria.getView(), modelFactoria.getModel());
  LOGGER.info("Finished the method main");
    
    
    
    
}
 
    
}
