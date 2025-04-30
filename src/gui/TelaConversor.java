package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaConversor {

	private JTextField textCelsius;
	private JLabel labelCelsius;
	private JButton buttonKelvin;
	private JButton buttonFahreinheit;
	private JLabel labelResultado;
	private JLabel labelMensagemErro;

	private void mostrarTemperatura() {
	}

	private void limparTemperatura() {
	}

	public void criarTelaTemperatura() {

		JFrame tela = new Tela();
		tela.setTitle("Conversor de temperatura");
		tela.setSize(400, 400);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLayout(null);
		tela.setResizable(false);
	}
	
	labeltextCelsius = new JLabel();

}
