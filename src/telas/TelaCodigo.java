package telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import entidades.Usuario;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;

public class TelaCodigo extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textCode;
	private JLabel lblNewLabel;
	private JLabel lblLocalizado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCodigo frame = new TelaCodigo(null);
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
	public TelaCodigo(Usuario user) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 320, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textCode = new JTextField();
		textCode.setBounds(48, 175, 203, 20);
		contentPane.add(textCode);
		textCode.setColumns(10);
		
		ImageIcon botaoIr = new ImageIcon("src/imagens/botao ir.png");
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textCode.getText().equals("xxxx")) {
					TelaDescarte td = new TelaDescarte(user);
					td.setVisible(true);
					td.setLocationRelativeTo(null);
					dispose();
				}
				else
					JOptionPane.showMessageDialog(null, "Código inválido");
			}
		});
		btnNewButton.setBounds(133, 204, 33, 23);
		contentPane.add(btnNewButton);
		botaoIr.setImage(botaoIr.getImage().getScaledInstance(btnNewButton.getWidth(), btnNewButton.getHeight(), 1));
		btnNewButton.setIcon(botaoIr);
		
		ImageIcon telaLC = new ImageIcon("src/imagens/background.png");
		
		lblNewLabel = new JLabel("Insira o c\u00F3digo do seu");
		lblNewLabel.setForeground(new Color(128, 0, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(10, 142, 284, 14);
		contentPane.add(lblNewLabel);
		
		lblLocalizado = new JLabel("pedido no iFood");
		lblLocalizado.setForeground(new Color(128, 0, 0));
		lblLocalizado.setHorizontalAlignment(SwingConstants.CENTER);
		lblLocalizado.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblLocalizado.setBounds(10, 156, 284, 14);
		contentPane.add(lblLocalizado);
		JLabel fundo = new JLabel("");
		fundo.setBounds(0, 0, 304, 441);
		contentPane.add(fundo);
		telaLC.setImage(telaLC.getImage().getScaledInstance(fundo.getWidth(), fundo.getHeight(), 1));
		fundo.setIcon(telaLC);
	}
}
