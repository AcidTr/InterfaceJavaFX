/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacejavafx;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Victor
 */
public class FXMLTelaCadastroMovimentacaoController implements Initializable {

     @FXML
    private ComboBox<?> cbCliente;

    @FXML
    private ComboBox<?> cbFunc;

    @FXML
    private Button btnVoltar;

    @FXML
    private DatePicker dpData;

    @FXML
    private TextField txtHora;
    
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
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        dpData.setValue(LocalDate.now());
        Calendar cal = Calendar.getInstance();
       
        txtHora.setText(Integer.toString(cal.get(Calendar.HOUR))+":"+Integer.toString(cal.get(Calendar.MINUTE))+":"+Integer.toString(cal.get(Calendar.SECOND)));
    }    
    
}
