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

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Menu;

import javafx.scene.image.Image;
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
    private Pane panSobre;

    @FXML
    private Stage stage;

    @FXML
    private Button btnCadUser;
   
    @FXML
    private Button btnCadFunc;

    @FXML
    private Button btnSair;

    @FXML
    private Button btnSobre;

    @FXML
    private Hyperlink hlGit;

    @FXML
    private Button btnPesq;

    @FXML
    private Button btnMov;

    @FXML
    private Button btnServ;

    @FXML
    private Button btnProd;
    
    @FXML
    private void hlGitOpen() {
        //ação para abrir link do GitHub no navegador.(pesquisar)
    }

    @FXML
    private void bVoltar() {
        panSobre.setVisible(false);
    }

    @FXML
    private void bSobre() {
        panSobre.setVisible(true);
    }

    @FXML
    private void cadUsuario() throws Exception{
        if (panSobre.isVisible()) {
            panSobre.setVisible(false);
        }
        Stage stage = new Stage();

        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("FXMLTelaCadastroUsuarioSDI.fxml"));
        } catch (IOException ex) {
            Logger.getLogger(FXMLTelaCadastroUsuarioSDIController.class.getName()).log(Level.SEVERE, null, ex);
        }

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
        btnCadUser.getScene().getWindow().hide();
        
    }
   
    @FXML
    private void cadFunc() throws Exception{
        if (panSobre.isVisible()) {
            panSobre.setVisible(false);
        }
        Stage stage = new Stage();

        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("FXMLTelaCadastroFunc.fxml")); //Carregar tela de cadastro de funcionários
        } catch (IOException ex) {
            Logger.getLogger(FXMLTelaCadastroFuncController.class.getName()).log(Level.SEVERE, null, ex);
        }

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
        btnCadFunc.getScene().getWindow().hide();
        
    }
    
    @FXML
    private void cadMov() throws Exception{
        if (panSobre.isVisible()) {
            panSobre.setVisible(false);
        }
        Stage stage = new Stage();

        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("FXMLTelaCadastroMovimentacao.fxml"));
        } catch (IOException ex) {
            Logger.getLogger(FXMLTelaCadastroMovimentacaoController.class.getName()).log(Level.SEVERE, null, ex);
        }

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
        btnCadUser.getScene().getWindow().hide();
        
    }
    
    @FXML
    private void cadProd(){
        if (panSobre.isVisible()) {
            panSobre.setVisible(false);
        }
        Stage stage = new Stage();

        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("FXMLTelaCadastroProduto.fxml")); //Carregar tela de cadastro de funcionários
        } catch (IOException ex) {
            Logger.getLogger(FXMLTelaCadastroProdutoController.class.getName()).log(Level.SEVERE, null, ex);
        }

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
        btnCadFunc.getScene().getWindow().hide();
    }

    @FXML
    private void bSair() throws Exception {
        Stage stage = new Stage();
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("FXMLTelaLogin.fxml"));
        } catch (IOException ex) {
            Logger.getLogger(FXMLTelaLoginController.class.getName()).log(Level.SEVERE, null, ex);
        }

        Scene scene = new Scene(root);
        stage.setResizable(false);
        stage.setScene(scene);
        Image app = new Image(getClass().getResourceAsStream("imagens/61205.png"));
        stage.getIcons().add(app);
        stage.show();
        btnCadUser.getScene().getWindow().hide();

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        
        
        panSobre.setVisible(false);
        btnCadUser.setGraphic(new ImageView(new javafx.scene.image.Image(getClass().getResourceAsStream("imagens/user_add.png"))));
        btnSobre.setGraphic(new ImageView(new javafx.scene.image.Image(getClass().getResourceAsStream("imagens/help.png"))));
        btnSair.setGraphic(new ImageView(new javafx.scene.image.Image(getClass().getResourceAsStream("imagens/user_go.png"))));
        btnCadFunc.setGraphic(new ImageView(new javafx.scene.image.Image(getClass().getResourceAsStream("imagens/group_add.png"))));
        btnMov.setGraphic(new ImageView(new javafx.scene.image.Image(getClass().getResourceAsStream("imagens/add.png"))));
        btnProd.setGraphic(new ImageView(new javafx.scene.image.Image(getClass().getResourceAsStream("imagens/basket_add.png"))));
        btnServ.setGraphic(new ImageView(new javafx.scene.image.Image(getClass().getResourceAsStream("imagens/pencil_add.png"))));
        btnPesq.setGraphic(new ImageView(new javafx.scene.image.Image(getClass().getResourceAsStream("imagens/magnifier.png"))));
        btnMov.setVisible(false);

    }

}
