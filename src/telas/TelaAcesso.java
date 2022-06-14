package telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import entidades.Usuario;

import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class TelaAcesso extends JFrame {

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
					TelaAcesso frame = new TelaAcesso(null);
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
	public TelaAcesso(Usuario user) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 320, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("O que voc\u00EA quer");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Lucida Sans", Font.BOLD, 13));
		lblNewLabel.setBounds(10, 162, 284, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("acessar?");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Lucida Sans", Font.BOLD, 13));
		lblNewLabel_1.setBounds(10, 177, 284, 14);
		contentPane.add(lblNewLabel_1);
		
		ImageIcon botaoCartao = new ImageIcon("src/imagens/botao cartao.png");
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaPontos tpo = new TelaPontos(user);
				tpo.setVisible(true);
				tpo.setLocationRelativeTo(null);
				dispose();
			}
		});
		btnNewButton.setBounds(63, 196, 180, 64);
		contentPane.add(btnNewButton);
		botaoCartao.setImage(botaoCartao.getImage().getScaledInstance(btnNewButton.getWidth(), btnNewButton.getHeight(), 1));
		btnNewButton.setIcon(botaoCartao);
		
		ImageIcon botaoDescarte = new ImageIcon("src/imagens/botao descarte.png");
		JButton btnDescartar = new JButton("");
		btnDescartar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaLocais tl = new TelaLocais(user);
				tl.setVisible(true);
				tl.setLocationRelativeTo(null);
				dispose();
			}
		});
		btnDescartar.setBounds(63, 271, 180, 64);
		contentPane.add(btnDescartar);
		botaoDescarte.setImage(botaoDescarte.getImage().getScaledInstance(btnDescartar.getWidth(), btnDescartar.getHeight(), 1));
		btnDescartar.setIcon(botaoDescarte);
		
		ImageIcon telaLC = new ImageIcon("src/imagens/background.png");
		
		JLabel fundo = new JLabel("");
		fundo.setBounds(0, 0, 304, 441);
		contentPane.add(fundo);
		telaLC.setImage(telaLC.getImage().getScaledInstance(fundo.getWidth(), fundo.getHeight(), 1));
		fundo.setIcon(telaLC);
	}

}
