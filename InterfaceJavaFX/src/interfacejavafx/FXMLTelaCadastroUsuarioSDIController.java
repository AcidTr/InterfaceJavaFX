/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacejavafx;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Victor
 */
public class FXMLTelaCadastroUsuarioSDIController implements Initializable {

    @FXML
    private Button btnVoltar;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        btnVoltar.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Stage stage = new Stage();
                Parent root = null;
                try{
                    root = FXMLLoader.load(getClass().getResource("FXMLTelaPrincipal.fxml"));
                } catch (IOException ex) {
                    Logger.getLogger(FXMLTelaPrincipalController.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
                btnVoltar.getScene().getWindow().hide();
            }
        });
    }    
    
}
