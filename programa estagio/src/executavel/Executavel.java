package executavel;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class Executavel {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Executavel window = new Executavel();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Executavel() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 578, 428);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 562, 389);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Gill Sans MT", Font.PLAIN, 15));
		textField.setBounds(93, 91, 370, 33);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Aplicação para estágio");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Georgia", Font.PLAIN, 18));
		lblNewLabel.setBounds(93, 11, 355, 41);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Insira o texto desejado, abaixo:");
		lblNewLabel_1.setBounds(93, 74, 172, 14);
		panel.add(lblNewLabel_1);
		
		JButton reverse = new JButton("Desafio 1");
		reverse.setBounds(85, 169, 89, 23);
		panel.add(reverse);
		
		JButton duplicados = new JButton("Desafio 3");
		duplicados.setBounds(199, 169, 89, 23);
		panel.add(duplicados);
		
		JButton palindromos = new JButton("Desafio 2");
		palindromos.setBounds(85, 243, 89, 23);
		panel.add(palindromos);
		
		JButton maiusculas = new JButton("Desafio 4");
		maiusculas.setBounds(199, 243, 89, 23);
		panel.add(maiusculas);
		
		JButton anagrama = new JButton("Desafio 5");
		anagrama.setBounds(315, 205, 89, 23);
		panel.add(anagrama);
	}
}
