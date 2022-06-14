package telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import entidades.Usuario;
import repositorios.RepositorioUsuario;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JLayeredPane;
import java.awt.Color;

public class TelaLogin extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	RepositorioUsuario ru = new RepositorioUsuario();
	private JPanel contentPane;
	private JTextField textLogin;
	private JPasswordField textSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLogin frame = new TelaLogin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 320, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Email");
		lblNewLabel.setBounds(61, 150, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Senha");
		lblNewLabel_1.setBounds(61, 201, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		textLogin = new JTextField();
		textLogin.setBounds(61, 164, 186, 20);
		contentPane.add(textLogin);
		textLogin.setColumns(10);
		
		textSenha = new JPasswordField();
		textSenha.setBounds(61, 214, 186, 20);
		contentPane.add(textSenha);
		
		JButton btnNewButton = new JButton("Entrar");
		btnNewButton.setFont(new Font("Lucida Sans", Font.BOLD, 15));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(new Color(0, 100, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ru.login(textLogin.getText(), new String(textSenha.getPassword()))) {
					Usuario user = ru.buscar(textLogin.getText());
					TelaParceiros tp = new TelaParceiros(user);
					tp.setVisible(true);
					tp.setLocationRelativeTo(null);
					dispose();
				}
				else
					JOptionPane.showMessageDialog(null, "Login inválido");
			}
		});
		btnNewButton.setBounds(97, 306, 106, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cadastre-se");
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBackground(new Color(0, 100, 0));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaCadastro tc = new TelaCadastro();
				tc.setVisible(true);
				tc.setLocationRelativeTo(null);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.setBounds(97, 237, 106, 23);
		contentPane.add(btnNewButton_1);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(264, 150, -236, 203);
		contentPane.add(layeredPane);
		
		JLabel fundo = new JLabel("");
		fundo.setBounds(0, 0, 304, 441);
		contentPane.add(fundo);
		
		ImageIcon telaLC = new ImageIcon("src/imagens/background.png");
		telaLC.setImage(telaLC.getImage().getScaledInstance(fundo.getWidth(), fundo.getHeight(), 1));
		fundo.setIcon(telaLC);
	}
}
