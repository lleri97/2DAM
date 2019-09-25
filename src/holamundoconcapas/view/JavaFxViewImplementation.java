/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundoconcapas.view;

import com.sun.media.jfxmedia.logging.Logger;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Yeray
 * In this class we run the method start to create the JavaFX view
 */
public class JavaFxViewImplementation extends javafx.application.Application implements View{

   private static final java.util.logging.Logger LOGGER=java.util.logging.Logger.getLogger("holamundoconcapas.view.JavaFxViewImplementation");
    
 private String greeting;

    

  

         @Override
    public void showGreeting(String greeting) {
        launch(greeting);
    }
  
    
    @Override
    public void start(Stage stage) throws Exception {
      
        try{
            
            LOGGER.info("Starting JavaFX");
            
            FXMLLoader loader = new FXMLLoader(
             getClass().getResource("Ventana_chachi.fxml"));
            Parent root = (Parent)loader.load();
            Ventana_chachiController viewController= 
                    ((Ventana_chachiController)loader.getController());
            
            
            viewController.setGreeting(greeting);
            viewController.setStage(stage);
            viewController.initStage(root);
           
            LOGGER.info("Finished JavaFX");
     
        }catch(Exception e){
            LOGGER.severe("Error en el metodo start");
            e.printStackTrace();
        }
             
    
    }
         @Override
    public void init() throws Exception{
        this.greeting=getParameters().getRaw().get(0);
    }

    public void setGreeting(String greeting){
        
        this.greeting=greeting;
    }
   
    
}
