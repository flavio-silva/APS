package org.calculoemergiapet.controller;

import javafx.fxml.FXML;import javafx.scene.control.*;import javafx.scene.input.KeyCode;import org.calculoemergiapet.util.SceneManager;
public class LoginController {
    @FXML private TextField usernameField; @FXML private PasswordField passwordField; @FXML private Label errorLabel;
    @FXML private void initialize(){ passwordField.setOnKeyPressed(e->{if(e.getCode()== KeyCode.ENTER) handleLogin();}); }
    @FXML private void handleLogin(){ if(usernameField.getText().isBlank()||passwordField.getText().isBlank()){errorLabel.setText("Preencha usuário e senha.");return;} SceneManager.switchTo("ConceitoView.fxml"); }
    @FXML private void goToCadastro(){ SceneManager.switchTo("CadastroView.fxml"); }
}
