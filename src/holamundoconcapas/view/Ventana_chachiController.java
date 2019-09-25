/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundoconcapas.view;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

/**
 *
 * @author Yeray
 * In this class we prepare all the actions 
 * 
 */
public class Ventana_chachiController{
 
    @FXML
    private Label texto;
    private Button Botonsito;
    private String greeting;
    private Stage stage;
    
     private static final java.util.logging.Logger LOGGER=java.util.logging.Logger.getLogger("holamundoconcapas.view.Ventana_chachiController");
   
    @FXML
    public void buttonAction(ActionEvent event){
        LOGGER.info("Start of the method buttonAction");
        texto.setText(greeting+greeting);
        LOGGER.info("Finished the method buttonAction");
    }

    /**
     *In thin method we set the text on the window when its shown
     * @param e
     */
    public void onWindowShowing(WindowEvent e){
        LOGGER.info("Start of the method onWindowShowing");
    texto.setText(greeting);
    LOGGER.info("Finished the method onWindowShowing");
    }

    /**
     * We set the greeting
     * @param greeting the greeting to set
     */
    public void setGreeting(String greeting) {
        
        this.greeting = greeting;
        
        
    }/**
     * the stage is initialized 
     * @param root 
     */
    public void initStage(Parent root){
        LOGGER.info("Start of the method initStage");
         Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setOnShowing(this:: onWindowShowing);
        stage.show();
        LOGGER.info("Finished the method initStage");
    }

       /**
        * We set the stage
        * @param stage 
        */
    void setStage(Stage stage) {
        this.stage=stage;
    }


 

    
    
}
