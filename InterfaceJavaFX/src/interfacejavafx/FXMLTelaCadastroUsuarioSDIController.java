/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacejavafx;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Victor
 */
public class FXMLTelaCadastroUsuarioSDIController implements Initializable {

    @FXML
    private ChoiceBox<String> chbEstadoCivil;

    @FXML
    private Button btnVoltar;

    @FXML
    private TextField txtTel;

    @FXML
    private TextField txtProf;

    @FXML
    private TextField txtNome;

    @FXML
    private ToggleGroup sexo;

    @FXML
    private DatePicker dpNasc;

    @FXML
    private void bVoltar() {
        Stage stage = new Stage();
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("FXMLTelaPrincipal.fxml"));
        } catch (IOException ex) {
            Logger.getLogger(FXMLTelaPrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
        btnVoltar.getScene().getWindow().hide();
      //RadioButton radio = (RadioButton) (sexo.getSelectedToggle());
      //System.out.println(radio.getText());
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        chbEstadoCivil.getItems().add("Casado");
        chbEstadoCivil.getItems().add("Divorciado");
        chbEstadoCivil.getItems().add("Separado");
        chbEstadoCivil.getItems().add("Solteiro");
        chbEstadoCivil.getItems().add("Viúvo");
        chbEstadoCivil.setValue("Casado");
        dpNasc.setValue(LocalDate.now());

        /*btnVoltar.setOnAction(new EventHandler<ActionEvent>() {
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
        });*/
    }

}
