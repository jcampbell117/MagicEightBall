/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magic8ball;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author jcamp
 */
public class CreateEightBallViewController implements Initializable {

    @FXML private Label messageLabel;
    @FXML private TextField questionTextField;
    
    EightBall magicBall;
    
    /**
     * This method updates the messageLabel with a new
     * response
     */
    public void pressedMainButton() {
        if(questionTextField.getText().trim().isEmpty()) {
            messageLabel.setText("Please ask a question");
        } else
            messageLabel.setText(magicBall.getResponse());
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         magicBall = new EightBall();
    }    
    
    
    
}
