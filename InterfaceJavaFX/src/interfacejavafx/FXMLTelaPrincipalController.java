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
import javafx.scene.control.Hyperlink;
import javafx.scene.control.MenuBar;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Victor
 */
public class FXMLTelaPrincipalController implements Initializable {

    @FXML
    private MenuBar menuBar;
    
    @FXML
    private Pane pCadUser;
    
    @FXML
    private Pane panSobre;
    
    @FXML
    private Stage stage;
    
    @FXML
    private Button cadUser;
    
    @FXML
    private Button btnSair;
    
    @FXML
    private Button btnSobre;
    
    @FXML
    private Hyperlink hlGit;
    
    @FXML
    private void hlGitOpen(){
        //ação para abrir link do GitHub no navegador.(pesquisar)
    }
    
    @FXML
    private void bVoltar(){
        pCadUser.setVisible(false);
        panSobre.setVisible(false);
    }
    
    @FXML
    private void bSobre(){
        panSobre.setVisible(true);
    }
    
    @FXML
    private void cadUsuario(){
        if(panSobre.isVisible()){
            panSobre.setVisible(false);
        }
        pCadUser.setVisible(true);
        
       
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        panSobre.setVisible(false);
        pCadUser.setVisible(false);
        cadUser.setGraphic(new ImageView(new javafx.scene.image.Image(getClass().getResourceAsStream("imagens/user_add.png"))));
        cadUser.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Stage stage = new Stage();
                Parent root = null;
                try{
                    root = FXMLLoader.load(getClass().getResource("FXMLTelaCadastroUsuarioSDI.fxml"));
                } catch (IOException ex) {
                    Logger.getLogger(FXMLTelaCadastroUsuarioSDIController.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
                cadUser.getScene().getWindow().hide();
            }
        });
       
        
        btnSobre.setGraphic(new ImageView(new javafx.scene.image.Image(getClass().getResourceAsStream("imagens/help.png"))));
        
        btnSair.setGraphic(new ImageView(new javafx.scene.image.Image(getClass().getResourceAsStream("imagens/user_go.png"))));
        btnSair.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Stage stage = new Stage();
                Parent root = null;
                try{
                    root = FXMLLoader.load(getClass().getResource("FXMLTelaLogin.fxml"));
                } catch (IOException ex) {
                    Logger.getLogger(FXMLTelaLoginController.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
                cadUser.getScene().getWindow().hide();
            }
        });
        
    }
            
}
