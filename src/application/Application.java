package application;

import javax.swing.JOptionPane;

import models.SigmaModel;

public class Application {
    public static void main(String[] args) {
        var nome = JOptionPane.showInputDialog("Digite seu Nome de Sigma:");
        var rizzler = JOptionPane.showInputDialog("Digite sua Frase Rizzler:");
        var amostradinho = true;
        var aura = Long.parseLong(JOptionPane.showInputDialog("Digite sua Aura:"));

        SigmaModel sigmaModel = new SigmaModel(nome, rizzler, amostradinho, aura);

        System.out.println(sigmaModel);
    }
}
