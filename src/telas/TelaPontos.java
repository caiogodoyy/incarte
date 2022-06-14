package telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import entidades.Usuario;

import javax.swing.JProgressBar;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class TelaPontos extends JFrame {

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
					TelaPontos frame = new TelaPontos(null);
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
	public TelaPontos(Usuario user) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 320, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Seus pontos");
		lblNewLabel.setBounds(50, 152, 77, 14);
		contentPane.add(lblNewLabel);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setForeground(Color.RED);
		progressBar.setMaximum(30);
		progressBar.setBounds(50, 167, 208, 14);
		progressBar.setValue(user.getPontos());
		contentPane.add(progressBar);
		
		ImageIcon telaLC = new ImageIcon("src/imagens/background.png");
		
		JLabel lblNewLabel_1 = new JLabel(user.getPontos() + "/30");
		lblNewLabel_1.setBounds(228, 152, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		ImageIcon botaoVoltar = new ImageIcon("src/imagens/botao voltar.png");
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaParceiros tp = new TelaParceiros(user);
				tp.setVisible(true);
				tp.setLocationRelativeTo(null);
				dispose();
			}
		});
		btnNewButton.setBounds(10, 11, 26, 23);
		contentPane.add(btnNewButton);
		botaoVoltar.setImage(botaoVoltar.getImage().getScaledInstance(btnNewButton.getWidth(), btnNewButton.getHeight(), 1));
		btnNewButton.setIcon(botaoVoltar);
		
		JLabel fundo = new JLabel("");
		fundo.setBounds(0, 0, 304, 441);
		contentPane.add(fundo);
		telaLC.setImage(telaLC.getImage().getScaledInstance(fundo.getWidth(), fundo.getHeight(), 1));
		fundo.setIcon(telaLC);
	}
}
