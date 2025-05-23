package org.calculoemergiapet.controller;

import javafx.fxml.FXML;import javafx.scene.control.*;import org.calculoemergiapet.util.SceneManager;
public class CadastroController{
    @FXML private TextField nomeField,emailField,usuarioField; @FXML private PasswordField senhaField; @FXML private Label statusLabel;
    @FXML private void cadastrar(){ if(nomeField.getText().isBlank()||emailField.getText().isBlank()||usuarioField.getText().isBlank()||senhaField.getText().isBlank()){statusLabel.setText("Todos os campos devem ser preenchidos.");return;} statusLabel.setText("Cadastro realizado com sucesso!"); SceneManager.switchTo("LoginView.fxml"); }
    @FXML private void voltar(){ SceneManager.switchTo("LoginView.fxml"); }
}

