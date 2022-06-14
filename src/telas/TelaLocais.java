package telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import entidades.Usuario;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class TelaLocais extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLocais frame = new TelaLocais(null);
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
	public TelaLocais(Usuario user) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 320, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ImageIcon botaoIr = new ImageIcon("src/imagens/botao ir.png");
		JButton saoluis = new JButton("");
		saoluis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaCodigo tc = new TelaCodigo(user);
				tc.setVisible(true);
				tc.setLocationRelativeTo(null);
				dispose();
			}
		});
		saoluis.setBounds(221, 186, 33, 23);
		contentPane.add(saoluis);
		botaoIr.setImage(botaoIr.getImage().getScaledInstance(saoluis.getWidth(), saoluis.getHeight(), 1));
		saoluis.setIcon(botaoIr);
		
		JButton forneiro = new JButton("");
		forneiro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaCodigo tc = new TelaCodigo(user);
				tc.setVisible(true);
				tc.setLocationRelativeTo(null);
				dispose();
			}
		});
		forneiro.setBounds(221, 242, 33, 23);
		contentPane.add(forneiro);
		botaoIr.setImage(botaoIr.getImage().getScaledInstance(forneiro.getWidth(), forneiro.getHeight(), 1));
		forneiro.setIcon(botaoIr);
		
		JButton fazercrescer = new JButton("");
		fazercrescer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaCodigo tc = new TelaCodigo(user);
				tc.setVisible(true);
				tc.setLocationRelativeTo(null);
				dispose();
			}
		});
		fazercrescer.setBounds(221, 301, 33, 23);
		contentPane.add(fazercrescer);
		botaoIr.setImage(botaoIr.getImage().getScaledInstance(fazercrescer.getWidth(), fazercrescer.getHeight(), 1));
		fazercrescer.setIcon(botaoIr);
		
		ImageIcon opLocais = new ImageIcon("src/imagens/opcoes locais.png");
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(33, 175, 234, 161);
		contentPane.add(lblNewLabel);
		opLocais.setImage(opLocais.getImage().getScaledInstance(lblNewLabel.getWidth(), lblNewLabel.getHeight(), 1));
		lblNewLabel.setIcon(opLocais);
		
		JLabel lblNewLabel_1 = new JLabel("Pontos pr\u00F3ximos a voc\u00EA:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(33, 149, 221, 14);
		contentPane.add(lblNewLabel_1);
		
		ImageIcon telaLC = new ImageIcon("src/imagens/background.png");
		JLabel fundo = new JLabel("");
		fundo.setBounds(0, 0, 304, 441);
		contentPane.add(fundo);
		telaLC.setImage(telaLC.getImage().getScaledInstance(fundo.getWidth(), fundo.getHeight(), 1));
		fundo.setIcon(telaLC);
	}

}
