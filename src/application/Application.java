package application;

import javax.swing.JOptionPane;

import models.SigmaModel;

public class Application {
	public static void main(String[] args) {
		SigmaModel sigmaModel = new SigmaModel(JOptionPane.showInputDialog("Digite seu Nome de Sigma:"),
				JOptionPane.showInputDialog("Digite sua Frase Rizzler:"), true,
				Long.parseLong(JOptionPane.showInputDialog("Digite sua Aura:")));

		JOptionPane.showMessageDialog(null, sigmaModel);
	}
}
