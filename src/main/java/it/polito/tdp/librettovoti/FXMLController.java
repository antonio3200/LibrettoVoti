package it.polito.tdp.librettovoti;

import java.net.URL;
import java.util.ResourceBundle;

import it.polito.tdp.libretto.model.Libretto;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class FXMLController implements Initializable {
	private Libretto model;
    
    @FXML
    private Label label;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }  
    public void setModel(Libretto model) {
    	this.model=model;
    }
}
