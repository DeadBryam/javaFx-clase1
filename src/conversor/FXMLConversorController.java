/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversor;

import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.KeyEvent;

/**
 *
 * @author deadbryam
 */
public class FXMLConversorController implements Initializable {
    
    @FXML
    private Label lblResultado;
    @FXML
    private JFXTextField txtDecimal;
    
    @FXML
    void convertirABinario(ActionEvent evt){
        int decimal = Integer.parseInt(txtDecimal.getText());
        
        lblResultado.setText(Integer.toBinaryString(decimal));
    }
    
    @FXML
    void validar(KeyEvent evt){
        char key = evt.getCharacter().charAt(0);
        if (Character.isLetter(key)) {
            evt.consume();
        }
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
