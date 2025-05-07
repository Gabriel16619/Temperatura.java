package gui;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class TelaConversor {

	private JTextField textCelsius;
	private JLabel labelCelsius;
	private JButton buttonKelvin;
	private JTextField textKelvin;
	private JButton buttonLimparTemperatura;
	private JButton buttonFahreinheit;
	private JTextField textFahreinheit;
	private JLabel labelResultado;
	private JLabel labelMensagemErro;

	private void mostrarTemperatura() {
	}

	private void limparTemperatura() {
	}

	public void criarTelaConversor() {

		JFrame tela = new JFrame();
		tela.setTitle("Conversor de temperatura");
		tela.setSize(400, 400);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLayout(null);
		tela.setResizable(false);
	

		// labelCelsius
		labelCelsius = new JLabel();
		labelCelsius.setText("alterando:");
		labelCelsius.setBounds(20, 20, 150, 30);

		textCelsius = new JTextField();
		textCelsius.setText(null);
		textCelsius.setBounds(170, 20, 40, 30);

		// button Kelvin.
		buttonKelvin = new JButton();
		buttonKelvin.setBounds(20, 140, 100, 40);
		buttonKelvin.setText("Converter");

		// buttonLimparTemperatura
		buttonLimparTemperatura = new JButton();
		buttonLimparTemperatura.setText("Limpar");
		buttonLimparTemperatura.setBounds(150, 140, 100, 40);
		buttonLimparTemperatura.getText();

		// buttonFahreinheit

		buttonFahreinheit = new JButton();
		buttonFahreinheit.setBounds(20, 160, 100, 60);
		buttonFahreinheit.setText("Converter");

		

		
		buttonFahreinheit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
				String celsius = textCelsius.getText();
				
				
			}
		});
		
		buttonKelvin.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String kelvin = textKelvin.getText();
				
				
				
			}
		});
		
		buttonLimparTemperatura.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		} );
		
		tela.getContentPane().add(labelCelsius);
		tela.getContentPane().add(textCelsius);

		tela.getContentPane().add(buttonKelvin);
		tela.getContentPane().add(textKelvin);

		tela.getContentPane().add(buttonFahreinheit);
		tela.getContentPane().add(textFahreinheit);

		tela.getContentPane().add(labelResultado);
		tela.getContentPane().add(labelMensagemErro);
		
		tela.getContentPane().add(buttonLimparTemperatura);
		
		
		tela.setVisible(true);

		}
	
	
	}

	
	
	


