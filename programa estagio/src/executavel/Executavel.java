package executavel;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import metodos.*;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class Executavel {

	private JFrame frame;
	private JTextField textField;
	private final JLabel lblNewLabel_2 = new JLabel("Descrição:");

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
		lblNewLabel_1.setBounds(93, 74, 233, 14);
		panel.add(lblNewLabel_1);
		
		JButton reverse = new JButton("Desafio 1");
		reverse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Reverse rev = new Reverse();
				if(verificaCampoText()) {
					rev.setFrase("Hello, world!, OpenAIis amazing.");
					JOptionPane.showMessageDialog(null, rev.inverteString());
				}else {
					rev.setFrase(textField.getText());
					JOptionPane.showMessageDialog(null, rev.inverteString());
				}
				
			}
		});
		reverse.setBounds(10, 145, 104, 33);
		panel.add(reverse);
		
		JButton duplicados = new JButton("Desafio 2");
		duplicados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Duplicados dup = new Duplicados();
				if(verificaCampoText()) {
					dup.setFrase("Hello World!");
					JOptionPane.showMessageDialog(null, dup.mostrarSemDupli());
				}else {
					dup.setFrase(textField.getText());
					JOptionPane.showMessageDialog(null, dup.mostrarSemDupli());
				}
				
			}
		});
		duplicados.setBounds(116, 145, 104, 33);
		panel.add(duplicados);
		
		JButton palindromos = new JButton("Desafio 3");
		palindromos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Palindromos pali = new Palindromos();
				if(verificaCampoText()) {
					pali.setPalavra("babad");
					JOptionPane.showMessageDialog(null,pali.getMaiorPalin());
				}else {
					pali.setPalavra(textField.getText());
					JOptionPane.showMessageDialog(null,pali.getMaiorPalin());
				}
			}
		});
		palindromos.setBounds(222, 145, 104, 33);
		panel.add(palindromos);
		
		JButton maiusculas = new JButton("Desafio 4");
		maiusculas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(verificaCampoText()) {
					Maiusculas m = new Maiusculas("hello. how are you? i'm fine, thank you.");
					JOptionPane.showMessageDialog(null, m.mostraFraseMod());
				}else {
					Maiusculas m = new Maiusculas(textField.getText());
					JOptionPane.showMessageDialog(null, m.mostraFraseMod());
				}
			}
		});
		maiusculas.setBounds(328, 145, 104, 33);
		panel.add(maiusculas);
		
		JButton anagrama = new JButton("Desafio 5");
		anagrama.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(verificaCampoText()) {
					Anagrama anag = new Anagrama("racecar");
					JOptionPane.showMessageDialog(null, anag.comparaAnagram());
				}else {
					Anagrama anag = new Anagrama(textField.getText());
					JOptionPane.showMessageDialog(null, anag.comparaAnagram());
				}
			}
		});
		anagrama.setBounds(435, 145, 104, 32);
		panel.add(anagrama);
		lblNewLabel_2.setBounds(20, 190, 98, 31);
		panel.add(lblNewLabel_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(93, 221, 362, 157);
		panel.add(scrollPane);
		
		JTextPane txtpnOsDesafiosConsistem = new JTextPane();
		scrollPane.setViewportView(txtpnOsDesafiosConsistem);
		txtpnOsDesafiosConsistem.setEditable(false);
		txtpnOsDesafiosConsistem.setText("\tOs desafios consistem em manipulação  de String onde cada desafio a manipula de forma diferente, o desafio 1 consistem em inverter a ordem das palavras,(ex: ola mundo = mundo ola). \r\nO desafio 2 consiste em retirar as letras duplicadas das frases(ex: hello world = helo wrd). \r\nO desafio 3 consiste em encontrar o maior palindromo dentro da palavra (ex: rafa = afa).\r\nO desafio 4 consiste  em colocar em colocar as letras pós pontuação em maiuscula quando necessário (ex: ola mundo. sou feliz = Ola mundo. Sou feliz). \r\nO desafio 5 consiste em analisar se o anagrama de uma palavra é palindromo(ex: racecar = racecar logo true).\r\n\r\nObs: caso queira utilizar um exemplo invés de digitar o texto apenas deixe o campo em branco.\r\nsegue abaixo as legendas utilizadas  como exemplo caso o campo de texto fique em branco:\r\n\r\n-Desafio 1 : \"Hello, Wolrd! OpenAI is amazing\";\r\n\r\n-Desafio 2: \"Hello, World\";\r\n\r\n-Desafio 3: \"babad\";\r\n\r\n-Desafio 4: \"hello. how are you? i'm fine, thank you\";\r\n\r\n-Desafio 5: \"racecar\".");
	}
	private boolean verificaCampoText() {
		boolean flag = false;
		if(textField.getText().equals("")) {
			flag = true;
		}
		return flag;
	}
}
