/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundoconcapas.view;

import javafx.stage.Stage;
import org.junit.Test;
import static org.testfx.matcher.base.NodeMatchers.isVisible;
import static org.junit.Assert.*;
import static org.testfx.api.FxAssert.verifyThat;
import static org.testfx.matcher.control.LabeledMatchers.hasText;

import org.testfx.framework.junit.ApplicationTest;

/**
 *
 * @author Yeray
 */
public class Ventana_chachiControllerIT extends ApplicationTest {

    private String greeting = "Hola mundo";

    @Override
    public void start(Stage stage) throws Exception {
        JavaFxViewImplementation myapp
                = new JavaFxViewImplementation();
        
        myapp.setGreeting(greeting);
        myapp.start(stage);
    }
    
    public Ventana_chachiControllerIT() {
    }
    
    @Test
    public void testLabesHasGreeting() {
        clickOn("#Botonsito");
        verifyThat("#texto", hasText(greeting+greeting));
        
    }

    /**
     * @param greeting the greeting to set
     */
    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }
    
}
