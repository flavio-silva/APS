package org.calculoemergiapet.controller;
import org.calculoemergiapet.util.SceneManager;import javafx.fxml.FXML;
public class ConceitoController {
    @FXML private void irSimulacao(){ SceneManager.switchTo("SimulacaoView.fxml"); }
    @FXML private void irRelatorios(){ SceneManager.switchTo("RelatoriosView.fxml"); }
    @FXML private void irTutorial(){ SceneManager.switchTo("TutorialView.fxml"); }
    @FXML private void irConfiguracao(){ SceneManager.switchTo("ConfiguracaoView.fxml"); }
}