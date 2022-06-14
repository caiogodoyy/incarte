package telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import repositorios.RepositorioUsuario;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;

public class TelaCadastro extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	RepositorioUsuario ru = new RepositorioUsuario();
	private JPanel contentPane;
	private JTextField textNome;
	private JPasswordField textSenha;
	private JTextField textEmail;
	private JPasswordField textSenhaCheck;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastro frame = new TelaCadastro();
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
	public TelaCadastro() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 320, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(58, 159, 46, 14);
		contentPane.add(lblNome);
		
		JLabel lblNewLabel_1 = new JLabel("Email");
		lblNewLabel_1.setBounds(58, 204, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		textNome = new JTextField();
		textNome.setColumns(10);
		textNome.setBounds(58, 173, 186, 20);
		contentPane.add(textNome);
		
		textSenha = new JPasswordField();
		textSenha.setBounds(58, 261, 186, 20);
		contentPane.add(textSenha);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setBounds(58, 248, 46, 14);
		contentPane.add(lblSenha);
		
		JLabel lblNewLabel_1_1 = new JLabel("Confirmar Senha");
		lblNewLabel_1_1.setBounds(58, 292, 107, 14);
		contentPane.add(lblNewLabel_1_1);
		
		textEmail = new JTextField();
		textEmail.setColumns(10);
		textEmail.setBounds(58, 217, 186, 20);
		contentPane.add(textEmail);
		
		textSenhaCheck = new JPasswordField();
		textSenhaCheck.setBounds(58, 307, 186, 20);
		contentPane.add(textSenhaCheck);
		
		JButton btnNewButton = new JButton("Criar conta");
		btnNewButton.setFont(new Font("Lucida Sans", Font.BOLD, 11));
		btnNewButton.setBackground(new Color(0, 100, 0));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(new String(textSenha.getPassword()).equals(new String(textSenhaCheck.getPassword()))) {
					if(ru.cadastro(textEmail.getText(), new String(textSenha.getPassword()), textNome.getText()))
						JOptionPane.showMessageDialog(null, "Cadastro feito com sucesso!");
					else
						JOptionPane.showMessageDialog(null, "Cadastro inválido");
					dispose();
				}
				else
					JOptionPane.showMessageDialog(null, "Senhas fornecidas não são iguais");
			}
		});
		btnNewButton.setBounds(95, 354, 107, 23);
		contentPane.add(btnNewButton);
		
		JLabel fundo = new JLabel("");
		fundo.setBounds(0, 0, 304, 441);
		contentPane.add(fundo);
		
		ImageIcon telaLC = new ImageIcon("src/imagens/background.png");
		telaLC.setImage(telaLC.getImage().getScaledInstance(fundo.getWidth(), fundo.getHeight(), 1));
		fundo.setIcon(telaLC);
	}
}
