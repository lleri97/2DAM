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
    
    
   
    @FXML
    public void buttonAction(ActionEvent event){
        texto.setText(greeting+greeting);
    }

    /**
     *
     * @param e
     */
    public void onWindowShowing(WindowEvent e){
    texto.setText(greeting);
    }

    /**
     * @param greeting the greeting to set
     */
    public void setGreeting(String greeting) {
        this.greeting = greeting;
        
        
    }
    public void initStage(Parent root){
         Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setOnShowing(this:: onWindowShowing);
        stage.show();
    }

    void setStage(Stage stage) {
        this.stage=stage;
    }


 

    
    
}
