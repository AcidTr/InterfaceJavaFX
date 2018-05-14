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
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author Victor
 */
public class FXMLTelaLoginController implements Initializable {

    @FXML
    private TextField txtLogin;

    @FXML
    private TextField psSenha;

    @FXML
    private Button btnLogin;

    @FXML
    void handleButtonAction(ActionEvent event) {

    }

    

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        btnLogin.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (txtLogin.getText().equals("root") && psSenha.getText().equals("v1993")) {
                    Stage stage = new Stage();
                    Parent root = null;
                    try {
                        root = FXMLLoader.load(getClass().getResource("FXMLTelaPrincipal.fxml"));
                    } catch (IOException ex) {
                        Logger.getLogger(FXMLTelaPrincipalController.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    Scene scene = new Scene(root);
                    stage.setScene(scene);
                    stage.show();
                    btnLogin.getScene().getWindow().hide();
                } else if (txtLogin.getText().equals("") && psSenha.getText().equals("")) {
                    Alert al = new Alert(Alert.AlertType.WARNING);
                    al.setHeaderText("Acesso negado!");
                    al.setContentText("Digite um usuário ou senha válidos");
                    al.show();
                } else if (txtLogin.getText().equals("")) {
                    Alert al = new Alert(Alert.AlertType.WARNING);
                    al.setHeaderText("Acesso negado!");
                    al.setContentText("Digite um usuário válido");
                    al.show();
                } else if (psSenha.getText().equals("")) {
                    Alert al = new Alert(Alert.AlertType.WARNING);
                    al.setHeaderText("Acesso negado!");
                    al.setContentText("Digite senha válida");
                    al.show();
                } else {
                    Alert al = new Alert(Alert.AlertType.WARNING);
                    al.setHeaderText("Acesso negado!");
                    al.setContentText("Usuário ou senha incorreto");
                    al.show();
                }
            }
        });
        
        txtLogin.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                btnLogin.fire();
            }
        });
        
        psSenha.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                btnLogin.fire();
            }
        }); 
    }

}
