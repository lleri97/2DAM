/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundoconcapas;

import HolaMuncoConCapas.controller.Controller;
import holamundoconcapas.model.ModelFactory;
import holamundoconcapas.view.viewFactory;

/**
 *
 * @author Yeray
 */
public class Application {
public static void main(String[] args){
    ModelFactory modelFactoria = new ModelFactory();
    viewFactory viewFactoria =new viewFactory();
    Controller controlador = new Controller();
    
  controlador.run(viewFactoria.getView(), modelFactoria.getModel());
    
    
    
    
}
 
    
}
